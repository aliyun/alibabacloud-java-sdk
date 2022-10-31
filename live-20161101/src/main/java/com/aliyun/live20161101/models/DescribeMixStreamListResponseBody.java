// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeMixStreamListResponseBody extends TeaModel {
    @NameInMap("MixStreamList")
    public java.util.List<DescribeMixStreamListResponseBodyMixStreamList> mixStreamList;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("InputStreamNumber")
        public Integer inputStreamNumber;

        @NameInMap("LayoutId")
        public String layoutId;

        @NameInMap("MixStreamTemplate")
        public String mixStreamTemplate;

        @NameInMap("MixstreamId")
        public String mixstreamId;

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
