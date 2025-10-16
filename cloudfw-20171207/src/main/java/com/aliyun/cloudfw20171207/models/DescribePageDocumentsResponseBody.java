// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePageDocumentsResponseBody extends TeaModel {
    @NameInMap("Docs")
    public java.util.List<DescribePageDocumentsResponseBodyDocs> docs;

    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB1E4FCAuT2gK0jSZFvXXXnFXXa-3399-662.png">https://img.alicdn.com/tfs/TB1E4FCAuT2gK0jSZFvXXXnFXXa-3399-662.png</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <strong>example:</strong>
     * <p>sg_server</p>
     */
    @NameInMap("Module")
    public String module;

    @NameInMap("More")
    public DescribePageDocumentsResponseBodyMore more;

    /**
     * <strong>example:</strong>
     * <p>7C81E1AD-08C0-5E09-853B-FDC77B90****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePageDocumentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePageDocumentsResponseBody self = new DescribePageDocumentsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePageDocumentsResponseBody setDocs(java.util.List<DescribePageDocumentsResponseBodyDocs> docs) {
        this.docs = docs;
        return this;
    }
    public java.util.List<DescribePageDocumentsResponseBodyDocs> getDocs() {
        return this.docs;
    }

    public DescribePageDocumentsResponseBody setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public DescribePageDocumentsResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public DescribePageDocumentsResponseBody setMore(DescribePageDocumentsResponseBodyMore more) {
        this.more = more;
        return this;
    }
    public DescribePageDocumentsResponseBodyMore getMore() {
        return this.more;
    }

    public DescribePageDocumentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePageDocumentsResponseBodyDocs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="https://notify-center-test.ybaobx.com/webhook/arms">https://notify-center-test.ybaobx.com/webhook/arms</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribePageDocumentsResponseBodyDocs build(java.util.Map<String, ?> map) throws Exception {
            DescribePageDocumentsResponseBodyDocs self = new DescribePageDocumentsResponseBodyDocs();
            return TeaModel.build(map, self);
        }

        public DescribePageDocumentsResponseBodyDocs setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribePageDocumentsResponseBodyDocs setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribePageDocumentsResponseBodyMore extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="https://zjysfy.womanhospital.cn/pub/hos/0/noneBackGround.png">https://zjysfy.womanhospital.cn/pub/hos/0/noneBackGround.png</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribePageDocumentsResponseBodyMore build(java.util.Map<String, ?> map) throws Exception {
            DescribePageDocumentsResponseBodyMore self = new DescribePageDocumentsResponseBodyMore();
            return TeaModel.build(map, self);
        }

        public DescribePageDocumentsResponseBodyMore setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribePageDocumentsResponseBodyMore setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
