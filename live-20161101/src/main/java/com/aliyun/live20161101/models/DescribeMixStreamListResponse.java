// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeMixStreamListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("MixStreamList")
    @Validation(required = true)
    public java.util.List<DescribeMixStreamListResponseMixStreamList> mixStreamList;

    public static DescribeMixStreamListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMixStreamListResponse self = new DescribeMixStreamListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMixStreamListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMixStreamListResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeMixStreamListResponse setMixStreamList(java.util.List<DescribeMixStreamListResponseMixStreamList> mixStreamList) {
        this.mixStreamList = mixStreamList;
        return this;
    }
    public java.util.List<DescribeMixStreamListResponseMixStreamList> getMixStreamList() {
        return this.mixStreamList;
    }

    public static class DescribeMixStreamListResponseMixStreamList extends TeaModel {
        @NameInMap("MixstreamId")
        @Validation(required = true)
        public String mixstreamId;

        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("StreamName")
        @Validation(required = true)
        public String streamName;

        @NameInMap("LayoutId")
        @Validation(required = true)
        public String layoutId;

        @NameInMap("InputStreamNumber")
        @Validation(required = true)
        public Integer inputStreamNumber;

        @NameInMap("MixStreamTemplate")
        @Validation(required = true)
        public String mixStreamTemplate;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        public static DescribeMixStreamListResponseMixStreamList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMixStreamListResponseMixStreamList self = new DescribeMixStreamListResponseMixStreamList();
            return TeaModel.build(map, self);
        }

        public DescribeMixStreamListResponseMixStreamList setMixstreamId(String mixstreamId) {
            this.mixstreamId = mixstreamId;
            return this;
        }
        public String getMixstreamId() {
            return this.mixstreamId;
        }

        public DescribeMixStreamListResponseMixStreamList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeMixStreamListResponseMixStreamList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeMixStreamListResponseMixStreamList setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeMixStreamListResponseMixStreamList setLayoutId(String layoutId) {
            this.layoutId = layoutId;
            return this;
        }
        public String getLayoutId() {
            return this.layoutId;
        }

        public DescribeMixStreamListResponseMixStreamList setInputStreamNumber(Integer inputStreamNumber) {
            this.inputStreamNumber = inputStreamNumber;
            return this;
        }
        public Integer getInputStreamNumber() {
            return this.inputStreamNumber;
        }

        public DescribeMixStreamListResponseMixStreamList setMixStreamTemplate(String mixStreamTemplate) {
            this.mixStreamTemplate = mixStreamTemplate;
            return this;
        }
        public String getMixStreamTemplate() {
            return this.mixStreamTemplate;
        }

        public DescribeMixStreamListResponseMixStreamList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeMixStreamListResponseMixStreamList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

}
