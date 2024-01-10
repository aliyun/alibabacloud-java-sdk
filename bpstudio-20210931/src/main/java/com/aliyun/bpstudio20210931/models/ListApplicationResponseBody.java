// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ListApplicationResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>App listing information</p>
     */
    @NameInMap("Data")
    public java.util.List<ListApplicationResponseBodyData> data;

    /**
     * <p>The interface returns information</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The query token returned in this call.</p>
     */
    @NameInMap("NextToken")
    public Integer nextToken;

    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationResponseBody self = new ListApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListApplicationResponseBody setData(java.util.List<ListApplicationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListApplicationResponseBodyData> getData() {
        return this.data;
    }

    public ListApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApplicationResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationResponseBodyData extends TeaModel {
        /**
         * <p>The application ID.</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The time when the application was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The URL of the application architecture image.</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the resource group to which the application belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the application.</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationResponseBodyData self = new ListApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListApplicationResponseBodyData setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListApplicationResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListApplicationResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public ListApplicationResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApplicationResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListApplicationResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
