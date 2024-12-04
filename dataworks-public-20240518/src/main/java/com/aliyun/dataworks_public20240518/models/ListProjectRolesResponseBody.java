// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListProjectRolesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListProjectRolesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>61649187-0BCF-5E75-8D4B-64FDBEBBB447</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListProjectRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectRolesResponseBody self = new ListProjectRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectRolesResponseBody setPagingInfo(ListProjectRolesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListProjectRolesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListProjectRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProjectRolesResponseBodyPagingInfoProjectRoles extends TeaModel {
        /**
         * <p>The code of the role in the DataWorks workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>role_project_guest</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The name of the role in the DataWorks workspace.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The DataWorks workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>21229</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The type of the role in the DataWorks workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListProjectRolesResponseBodyPagingInfoProjectRoles build(java.util.Map<String, ?> map) throws Exception {
            ListProjectRolesResponseBodyPagingInfoProjectRoles self = new ListProjectRolesResponseBodyPagingInfoProjectRoles();
            return TeaModel.build(map, self);
        }

        public ListProjectRolesResponseBodyPagingInfoProjectRoles setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListProjectRolesResponseBodyPagingInfoProjectRoles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectRolesResponseBodyPagingInfoProjectRoles setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListProjectRolesResponseBodyPagingInfoProjectRoles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListProjectRolesResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public String pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <p>The roles in the DataWorks workspace.</p>
         */
        @NameInMap("ProjectRoles")
        public java.util.List<ListProjectRolesResponseBodyPagingInfoProjectRoles> projectRoles;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("TotalCount")
        public String totalCount;

        public static ListProjectRolesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListProjectRolesResponseBodyPagingInfo self = new ListProjectRolesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListProjectRolesResponseBodyPagingInfo setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public ListProjectRolesResponseBodyPagingInfo setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListProjectRolesResponseBodyPagingInfo setProjectRoles(java.util.List<ListProjectRolesResponseBodyPagingInfoProjectRoles> projectRoles) {
            this.projectRoles = projectRoles;
            return this;
        }
        public java.util.List<ListProjectRolesResponseBodyPagingInfoProjectRoles> getProjectRoles() {
            return this.projectRoles;
        }

        public ListProjectRolesResponseBodyPagingInfo setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
