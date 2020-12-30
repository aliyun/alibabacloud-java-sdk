// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeMnsOauthResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DescribeMnsOauthResponseBodyData data;

    public static DescribeMnsOauthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMnsOauthResponseBody self = new DescribeMnsOauthResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMnsOauthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMnsOauthResponseBody setData(DescribeMnsOauthResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeMnsOauthResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeMnsOauthResponseBodyData extends TeaModel {
        @NameInMap("TopicList")
        public java.util.List<String> topicList;

        @NameInMap("TopicName")
        public String topicName;

        @NameInMap("MnsAuthorized")
        public Boolean mnsAuthorized;

        @NameInMap("EndPoint")
        public String endPoint;

        @NameInMap("MnsServe")
        public Boolean mnsServe;

        @NameInMap("OpenMnsService")
        public Boolean openMnsService;

        public static DescribeMnsOauthResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMnsOauthResponseBodyData self = new DescribeMnsOauthResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMnsOauthResponseBodyData setTopicList(java.util.List<String> topicList) {
            this.topicList = topicList;
            return this;
        }
        public java.util.List<String> getTopicList() {
            return this.topicList;
        }

        public DescribeMnsOauthResponseBodyData setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public DescribeMnsOauthResponseBodyData setMnsAuthorized(Boolean mnsAuthorized) {
            this.mnsAuthorized = mnsAuthorized;
            return this;
        }
        public Boolean getMnsAuthorized() {
            return this.mnsAuthorized;
        }

        public DescribeMnsOauthResponseBodyData setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public DescribeMnsOauthResponseBodyData setMnsServe(Boolean mnsServe) {
            this.mnsServe = mnsServe;
            return this;
        }
        public Boolean getMnsServe() {
            return this.mnsServe;
        }

        public DescribeMnsOauthResponseBodyData setOpenMnsService(Boolean openMnsService) {
            this.openMnsService = openMnsService;
            return this;
        }
        public Boolean getOpenMnsService() {
            return this.openMnsService;
        }

    }

}
