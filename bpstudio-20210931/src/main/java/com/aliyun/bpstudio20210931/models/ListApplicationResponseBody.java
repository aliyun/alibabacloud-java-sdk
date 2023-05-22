// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ListApplicationResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListApplicationResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public Integer nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("Name")
        public String name;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TopoURL")
        public String topoURL;

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

        public ListApplicationResponseBodyData setTopoURL(String topoURL) {
            this.topoURL = topoURL;
            return this;
        }
        public String getTopoURL() {
            return this.topoURL;
        }

    }

}
