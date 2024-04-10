// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribePageFaceVerifyDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CurrentPage")
    public String currentPage;

    @NameInMap("Items")
    public java.util.List<DescribePageFaceVerifyDataResponseBodyItems> items;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("TotalPage")
    public String totalPage;

    public static DescribePageFaceVerifyDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePageFaceVerifyDataResponseBody self = new DescribePageFaceVerifyDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePageFaceVerifyDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePageFaceVerifyDataResponseBody setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribePageFaceVerifyDataResponseBody setItems(java.util.List<DescribePageFaceVerifyDataResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribePageFaceVerifyDataResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribePageFaceVerifyDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePageFaceVerifyDataResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribePageFaceVerifyDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePageFaceVerifyDataResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribePageFaceVerifyDataResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public DescribePageFaceVerifyDataResponseBody setTotalPage(String totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public String getTotalPage() {
        return this.totalPage;
    }

    public static class DescribePageFaceVerifyDataResponseBodyItems extends TeaModel {
        @NameInMap("Date")
        public String date;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("SuccessCount")
        public String successCount;

        @NameInMap("TotalCount")
        public String totalCount;

        public static DescribePageFaceVerifyDataResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePageFaceVerifyDataResponseBodyItems self = new DescribePageFaceVerifyDataResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribePageFaceVerifyDataResponseBodyItems setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribePageFaceVerifyDataResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribePageFaceVerifyDataResponseBodyItems setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public DescribePageFaceVerifyDataResponseBodyItems setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public DescribePageFaceVerifyDataResponseBodyItems setSuccessCount(String successCount) {
            this.successCount = successCount;
            return this;
        }
        public String getSuccessCount() {
            return this.successCount;
        }

        public DescribePageFaceVerifyDataResponseBodyItems setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
