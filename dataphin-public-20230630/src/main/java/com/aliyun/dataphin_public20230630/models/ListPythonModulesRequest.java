// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListPythonModulesRequest extends TeaModel {
    /**
     * <p>The paging conditions for the paged query.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListPythonModulesRequestListQuery listQuery;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static ListPythonModulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPythonModulesRequest self = new ListPythonModulesRequest();
        return TeaModel.build(map, self);
    }

    public ListPythonModulesRequest setListQuery(ListPythonModulesRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListPythonModulesRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListPythonModulesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListPythonModulesRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class ListPythonModulesRequestListQuery extends TeaModel {
        /**
         * <p>The keyword of the third-party package name.</p>
         * 
         * <strong>example:</strong>
         * <p>numpy</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The ID of the Python third-party package.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("PythonModuleId")
        public Long pythonModuleId;

        /**
         * <p>The Python version. Valid values: PYTHON_2_7, PYTHON_3_7, and PYTHON_3_11.</p>
         * 
         * <strong>example:</strong>
         * <p>PYTHON_3_7</p>
         */
        @NameInMap("PythonVersion")
        public String pythonVersion;

        public static ListPythonModulesRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListPythonModulesRequestListQuery self = new ListPythonModulesRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListPythonModulesRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListPythonModulesRequestListQuery setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListPythonModulesRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPythonModulesRequestListQuery setPythonModuleId(Long pythonModuleId) {
            this.pythonModuleId = pythonModuleId;
            return this;
        }
        public Long getPythonModuleId() {
            return this.pythonModuleId;
        }

        public ListPythonModulesRequestListQuery setPythonVersion(String pythonVersion) {
            this.pythonVersion = pythonVersion;
            return this;
        }
        public String getPythonVersion() {
            return this.pythonVersion;
        }

    }

}
