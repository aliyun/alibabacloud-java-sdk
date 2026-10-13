// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListDevelopersResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public ListDevelopersResponseBodyData data;

    /**
     * <p>The maximum number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The cursor for the next page. An empty value indicates that the last page has been reached.</p>
     * 
     * <strong>example:</strong>
     * <p>token-xxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListDevelopersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDevelopersResponseBody self = new ListDevelopersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDevelopersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDevelopersResponseBody setData(ListDevelopersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDevelopersResponseBodyData getData() {
        return this.data;
    }

    public ListDevelopersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDevelopersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDevelopersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDevelopersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDevelopersResponseBodyDataContent extends TeaModel {
        /**
         * <p>The developer ID. You can use this ID to locate the developer in API operations such as SetHiMarketDeveloperStatus and DeleteHiMarketDeveloper.</p>
         * 
         * <strong>example:</strong>
         * <p>dev-xxxxxxxx</p>
         */
        @NameInMap("developerId")
        public String developerId;

        /**
         * <p>The ID of the portal to which the developer belongs. You can use this ID to locate the portal in API operations such as GetPortal, UpdatePortal, and DeletePortal.</p>
         * 
         * <strong>example:</strong>
         * <p>portal-xxxxxxxx</p>
         */
        @NameInMap("portalId")
        public String portalId;

        /**
         * <p>The status of the developer. Valid values: PENDING, APPROVED, and REJECTED.</p>
         * 
         * <strong>example:</strong>
         * <p>APPROVED</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The logon username of the developer.</p>
         * 
         * <strong>example:</strong>
         * <p>developer-demo</p>
         */
        @NameInMap("username")
        public String username;

        public static ListDevelopersResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListDevelopersResponseBodyDataContent self = new ListDevelopersResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListDevelopersResponseBodyDataContent setDeveloperId(String developerId) {
            this.developerId = developerId;
            return this;
        }
        public String getDeveloperId() {
            return this.developerId;
        }

        public ListDevelopersResponseBodyDataContent setPortalId(String portalId) {
            this.portalId = portalId;
            return this;
        }
        public String getPortalId() {
            return this.portalId;
        }

        public ListDevelopersResponseBodyDataContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDevelopersResponseBodyDataContent setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListDevelopersResponseBodyData extends TeaModel {
        /**
         * <p>The list of developers.</p>
         */
        @NameInMap("content")
        public java.util.List<ListDevelopersResponseBodyDataContent> content;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalCount")
        public Integer totalCount;

        public static ListDevelopersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDevelopersResponseBodyData self = new ListDevelopersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDevelopersResponseBodyData setContent(java.util.List<ListDevelopersResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListDevelopersResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListDevelopersResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDevelopersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDevelopersResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
