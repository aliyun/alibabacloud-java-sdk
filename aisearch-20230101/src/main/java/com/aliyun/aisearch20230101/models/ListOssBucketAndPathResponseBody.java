// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class ListOssBucketAndPathResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListOssBucketAndPathResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListOssBucketAndPathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOssBucketAndPathResponseBody self = new ListOssBucketAndPathResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOssBucketAndPathResponseBody setData(ListOssBucketAndPathResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListOssBucketAndPathResponseBodyData getData() {
        return this.data;
    }

    public ListOssBucketAndPathResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOssBucketAndPathResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListOssBucketAndPathResponseBodyData extends TeaModel {
        @NameInMap("BucketList")
        public java.util.List<String> bucketList;

        @NameInMap("PathList")
        public java.util.List<String> pathList;

        public static ListOssBucketAndPathResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOssBucketAndPathResponseBodyData self = new ListOssBucketAndPathResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOssBucketAndPathResponseBodyData setBucketList(java.util.List<String> bucketList) {
            this.bucketList = bucketList;
            return this;
        }
        public java.util.List<String> getBucketList() {
            return this.bucketList;
        }

        public ListOssBucketAndPathResponseBodyData setPathList(java.util.List<String> pathList) {
            this.pathList = pathList;
            return this;
        }
        public java.util.List<String> getPathList() {
            return this.pathList;
        }

    }

}
