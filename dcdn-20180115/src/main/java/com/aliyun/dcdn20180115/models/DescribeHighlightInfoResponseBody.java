// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeHighlightInfoResponseBody extends TeaModel {
    /**
     * <p>The model of the highlighted data.</p>
     */
    @NameInMap("DataModule")
    public java.util.List<DescribeHighlightInfoResponseBodyDataModule> dataModule;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHighlightInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHighlightInfoResponseBody self = new DescribeHighlightInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHighlightInfoResponseBody setDataModule(java.util.List<DescribeHighlightInfoResponseBodyDataModule> dataModule) {
        this.dataModule = dataModule;
        return this;
    }
    public java.util.List<DescribeHighlightInfoResponseBodyDataModule> getDataModule() {
        return this.dataModule;
    }

    public DescribeHighlightInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHighlightInfoResponseBodyDataModule extends TeaModel {
        /**
         * <p>The highlighted data.</p>
         */
        @NameInMap("Hit")
        public String hit;

        /**
         * <p>The type of the highlight data.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Complete data.</p>
         */
        @NameInMap("Raw")
        public String raw;

        public static DescribeHighlightInfoResponseBodyDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeHighlightInfoResponseBodyDataModule self = new DescribeHighlightInfoResponseBodyDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeHighlightInfoResponseBodyDataModule setHit(String hit) {
            this.hit = hit;
            return this;
        }
        public String getHit() {
            return this.hit;
        }

        public DescribeHighlightInfoResponseBodyDataModule setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeHighlightInfoResponseBodyDataModule setRaw(String raw) {
            this.raw = raw;
            return this;
        }
        public String getRaw() {
            return this.raw;
        }

    }

}
