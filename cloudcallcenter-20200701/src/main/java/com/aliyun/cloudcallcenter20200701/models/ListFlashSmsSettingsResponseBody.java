// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class ListFlashSmsSettingsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListFlashSmsSettingsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>FCEFE806-E67C-577E-865B-4ED398F2F648</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFlashSmsSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlashSmsSettingsResponseBody self = new ListFlashSmsSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlashSmsSettingsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFlashSmsSettingsResponseBody setData(ListFlashSmsSettingsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFlashSmsSettingsResponseBodyData getData() {
        return this.data;
    }

    public ListFlashSmsSettingsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListFlashSmsSettingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFlashSmsSettingsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListFlashSmsSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFlashSmsSettingsResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>57fd969d-1936-4879-baaf-4bc57b3caef0</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>skg1@ccc-test</p>
         */
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        /**
         * <strong>example:</strong>
         * <p>skg</p>
         */
        @NameInMap("SkillGroupName")
        public String skillGroupName;

        public static ListFlashSmsSettingsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListFlashSmsSettingsResponseBodyDataList self = new ListFlashSmsSettingsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListFlashSmsSettingsResponseBodyDataList setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListFlashSmsSettingsResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListFlashSmsSettingsResponseBodyDataList setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListFlashSmsSettingsResponseBodyDataList setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

    }

    public static class ListFlashSmsSettingsResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListFlashSmsSettingsResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListFlashSmsSettingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFlashSmsSettingsResponseBodyData self = new ListFlashSmsSettingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFlashSmsSettingsResponseBodyData setList(java.util.List<ListFlashSmsSettingsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListFlashSmsSettingsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListFlashSmsSettingsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListFlashSmsSettingsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFlashSmsSettingsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
