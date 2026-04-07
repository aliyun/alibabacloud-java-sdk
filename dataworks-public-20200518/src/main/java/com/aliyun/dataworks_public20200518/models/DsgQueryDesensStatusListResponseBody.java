// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgQueryDesensStatusListResponseBody extends TeaModel {
    @NameInMap("Data")
    public DsgQueryDesensStatusListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>400010</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>param error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>AASFDFSDFG-DFSDF-DFSDFD-SDFSDF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DsgQueryDesensStatusListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DsgQueryDesensStatusListResponseBody self = new DsgQueryDesensStatusListResponseBody();
        return TeaModel.build(map, self);
    }

    public DsgQueryDesensStatusListResponseBody setData(DsgQueryDesensStatusListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DsgQueryDesensStatusListResponseBodyData getData() {
        return this.data;
    }

    public DsgQueryDesensStatusListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DsgQueryDesensStatusListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DsgQueryDesensStatusListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DsgQueryDesensStatusListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DsgQueryDesensStatusListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DsgQueryDesensStatusListResponseBodyDataPageData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DesensStatus")
        public Integer desensStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HandleSpace")
        public String handleSpace;

        /**
         * <strong>example:</strong>
         * <p>56207</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>test_space</p>
         */
        @NameInMap("WorkspaceIdentifier")
        public String workspaceIdentifier;

        /**
         * <strong>example:</strong>
         * <p>test_space</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static DsgQueryDesensStatusListResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            DsgQueryDesensStatusListResponseBodyDataPageData self = new DsgQueryDesensStatusListResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public DsgQueryDesensStatusListResponseBodyDataPageData setDesensStatus(Integer desensStatus) {
            this.desensStatus = desensStatus;
            return this;
        }
        public Integer getDesensStatus() {
            return this.desensStatus;
        }

        public DsgQueryDesensStatusListResponseBodyDataPageData setHandleSpace(String handleSpace) {
            this.handleSpace = handleSpace;
            return this;
        }
        public String getHandleSpace() {
            return this.handleSpace;
        }

        public DsgQueryDesensStatusListResponseBodyDataPageData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DsgQueryDesensStatusListResponseBodyDataPageData setWorkspaceIdentifier(String workspaceIdentifier) {
            this.workspaceIdentifier = workspaceIdentifier;
            return this;
        }
        public String getWorkspaceIdentifier() {
            return this.workspaceIdentifier;
        }

        public DsgQueryDesensStatusListResponseBodyDataPageData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

    public static class DsgQueryDesensStatusListResponseBodyData extends TeaModel {
        @NameInMap("PageData")
        public java.util.List<DsgQueryDesensStatusListResponseBodyDataPageData> pageData;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DsgQueryDesensStatusListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DsgQueryDesensStatusListResponseBodyData self = new DsgQueryDesensStatusListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DsgQueryDesensStatusListResponseBodyData setPageData(java.util.List<DsgQueryDesensStatusListResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<DsgQueryDesensStatusListResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public DsgQueryDesensStatusListResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DsgQueryDesensStatusListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DsgQueryDesensStatusListResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
