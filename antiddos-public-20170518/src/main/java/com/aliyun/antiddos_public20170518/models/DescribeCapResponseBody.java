// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeCapResponseBody extends TeaModel {
    /**
     * <p>The download link to the traffic data that is captured when a DDoS attack event occurs.</p>
     */
    @NameInMap("CapUrl")
    public DescribeCapResponseBodyCapUrl capUrl;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>C728D7E9-9A39-52E0-966B-5C33118BDBB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapResponseBody self = new DescribeCapResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCapResponseBody setCapUrl(DescribeCapResponseBodyCapUrl capUrl) {
        this.capUrl = capUrl;
        return this;
    }
    public DescribeCapResponseBodyCapUrl getCapUrl() {
        return this.capUrl;
    }

    public DescribeCapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCapResponseBodyCapUrl extends TeaModel {
        /**
         * <p>The download link to the traffic data.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://beaver-pack****.oss-cn-hangzhou.aliyuncs.com/ddos-2021112511-121.89.XX.XX.cap?Expires=1637824408&OSSAccessKeyId=LTAIXu2lJhw3****&Signature=KKSzOMSUajtwcqfqxkU1nK69d4">http://beaver-pack****.oss-cn-hangzhou.aliyuncs.com/ddos-2021112511-121.89.XX.XX.cap?Expires=1637824408&amp;OSSAccessKeyId=LTAIXu2lJhw3****&amp;Signature=KKSzOMSUajtwcqfqxkU1nK69d4</a>****</p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribeCapResponseBodyCapUrl build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapResponseBodyCapUrl self = new DescribeCapResponseBodyCapUrl();
            return TeaModel.build(map, self);
        }

        public DescribeCapResponseBodyCapUrl setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
