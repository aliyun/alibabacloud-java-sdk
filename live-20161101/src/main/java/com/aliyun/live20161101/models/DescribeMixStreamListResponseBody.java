// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeMixStreamListResponseBody extends TeaModel {
    /**
     * <p>Details about the stream mixing tasks.</p>
     */
    @NameInMap("MixStreamList")
    public java.util.List<DescribeMixStreamListResponseBodyMixStreamList> mixStreamList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BC1E78D3-FA8B-4457-DEE2-6093E1232254</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeMixStreamListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMixStreamListResponseBody self = new DescribeMixStreamListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMixStreamListResponseBody setMixStreamList(java.util.List<DescribeMixStreamListResponseBodyMixStreamList> mixStreamList) {
        this.mixStreamList = mixStreamList;
        return this;
    }
    public java.util.List<DescribeMixStreamListResponseBodyMixStreamList> getMixStreamList() {
        return this.mixStreamList;
    }

    public DescribeMixStreamListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMixStreamListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeMixStreamListResponseBodyMixStreamList extends TeaModel {
        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The time when the stream mixing task was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-17T08:39:14Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the stream mixing task was modified. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-17T08:39:15Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The number of input streams.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InputStreamNumber")
        public Integer inputStreamNumber;

        /**
         * <p>The ID of the layout.</p>
         * 
         * <strong>example:</strong>
         * <p>USERDEFINED</p>
         */
        @NameInMap("LayoutId")
        public String layoutId;

        /**
         * <p>The stream mixing template.</p>
         * 
         * <strong>example:</strong>
         * <p>lp_ld</p>
         */
        @NameInMap("MixStreamTemplate")
        public String mixStreamTemplate;

        /**
         * <p>The ID of the stream mixing task. You can specify this parameter in a request to delete the steam mixing task.</p>
         * 
         * <strong>example:</strong>
         * <p>aaf9a50f-c460-3a9b-f180-38dd8f05****</p>
         */
        @NameInMap("MixstreamId")
        public String mixstreamId;

        /**
         * <p>The name of the output stream.</p>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        public static DescribeMixStreamListResponseBodyMixStreamList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMixStreamListResponseBodyMixStreamList self = new DescribeMixStreamListResponseBodyMixStreamList();
            return TeaModel.build(map, self);
        }

        public DescribeMixStreamListResponseBodyMixStreamList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeMixStreamListResponseBodyMixStreamList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeMixStreamListResponseBodyMixStreamList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeMixStreamListResponseBodyMixStreamList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeMixStreamListResponseBodyMixStreamList setInputStreamNumber(Integer inputStreamNumber) {
            this.inputStreamNumber = inputStreamNumber;
            return this;
        }
        public Integer getInputStreamNumber() {
            return this.inputStreamNumber;
        }

        public DescribeMixStreamListResponseBodyMixStreamList setLayoutId(String layoutId) {
            this.layoutId = layoutId;
            return this;
        }
        public String getLayoutId() {
            return this.layoutId;
        }

        public DescribeMixStreamListResponseBodyMixStreamList setMixStreamTemplate(String mixStreamTemplate) {
            this.mixStreamTemplate = mixStreamTemplate;
            return this;
        }
        public String getMixStreamTemplate() {
            return this.mixStreamTemplate;
        }

        public DescribeMixStreamListResponseBodyMixStreamList setMixstreamId(String mixstreamId) {
            this.mixstreamId = mixstreamId;
            return this;
        }
        public String getMixstreamId() {
            return this.mixstreamId;
        }

        public DescribeMixStreamListResponseBodyMixStreamList setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

    }

}
