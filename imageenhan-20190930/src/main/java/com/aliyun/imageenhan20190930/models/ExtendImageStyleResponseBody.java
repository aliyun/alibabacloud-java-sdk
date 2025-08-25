// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ExtendImageStyleResponseBody extends TeaModel {
    @NameInMap("Data")
    public ExtendImageStyleResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>F1ABC965-2612-4680-9DE3-B5C77434B9B7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExtendImageStyleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExtendImageStyleResponseBody self = new ExtendImageStyleResponseBody();
        return TeaModel.build(map, self);
    }

    public ExtendImageStyleResponseBody setData(ExtendImageStyleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExtendImageStyleResponseBodyData getData() {
        return this.data;
    }

    public ExtendImageStyleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ExtendImageStyleResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("MajorUrl")
        public String majorUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="http://luban-vgd-invi.oss-cn-hangzhou.aliyuncs.com/upload/result_/2019-9-26/invi__015694889247201016812_spCq4n.jpg?Expires=1569492524&OSSAccessKeyId=LTAI4Fc5SVvzUQ19K1Cz****&Signature=uOEP8gKvdgPtDcrXxRz1v37dsT">http://luban-vgd-invi.oss-cn-hangzhou.aliyuncs.com/upload/result_/2019-9-26/invi__015694889247201016812_spCq4n.jpg?Expires=1569492524&amp;OSSAccessKeyId=LTAI4Fc5SVvzUQ19K1Cz****&amp;Signature=uOEP8gKvdgPtDcrXxRz1v37dsT</a>****</p>
         */
        @NameInMap("Url")
        public String url;

        public static ExtendImageStyleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExtendImageStyleResponseBodyData self = new ExtendImageStyleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExtendImageStyleResponseBodyData setMajorUrl(String majorUrl) {
            this.majorUrl = majorUrl;
            return this;
        }
        public String getMajorUrl() {
            return this.majorUrl;
        }

        public ExtendImageStyleResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
