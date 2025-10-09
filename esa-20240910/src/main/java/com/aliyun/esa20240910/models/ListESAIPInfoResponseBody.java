// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListESAIPInfoResponseBody extends TeaModel {
    /**
     * <p>The objects that are returned.</p>
     */
    @NameInMap("Content")
    public java.util.List<ListESAIPInfoResponseBodyContent> content;

    /**
     * <p>The request ID.</p>
     * <p>Example D03F9502-6653-127C-8A5F-0647197\<em>\</em>\<em>\</em>\*</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListESAIPInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListESAIPInfoResponseBody self = new ListESAIPInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListESAIPInfoResponseBody setContent(java.util.List<ListESAIPInfoResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<ListESAIPInfoResponseBodyContent> getContent() {
        return this.content;
    }

    public ListESAIPInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListESAIPInfoResponseBodyContent extends TeaModel {
        /**
         * <p>Whether the IP address in the parameter belongs to ESA POPs.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CdnIp")
        public String cdnIp;

        /**
         * <p>The IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>27.129.167.239</p>
         */
        @NameInMap("Ip")
        public String ip;

        public static ListESAIPInfoResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListESAIPInfoResponseBodyContent self = new ListESAIPInfoResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListESAIPInfoResponseBodyContent setCdnIp(String cdnIp) {
            this.cdnIp = cdnIp;
            return this;
        }
        public String getCdnIp() {
            return this.cdnIp;
        }

        public ListESAIPInfoResponseBodyContent setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

}
