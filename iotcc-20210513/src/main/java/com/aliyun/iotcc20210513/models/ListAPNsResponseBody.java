// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListAPNsResponseBody extends TeaModel {
    @NameInMap("APNs")
    public java.util.List<ListAPNsResponseBodyAPNs> APNs;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAPNsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAPNsResponseBody self = new ListAPNsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAPNsResponseBody setAPNs(java.util.List<ListAPNsResponseBodyAPNs> APNs) {
        this.APNs = APNs;
        return this;
    }
    public java.util.List<ListAPNsResponseBodyAPNs> getAPNs() {
        return this.APNs;
    }

    public ListAPNsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAPNsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAPNsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAPNsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAPNsResponseBodyAPNs extends TeaModel {
        @NameInMap("APN")
        public String APN;

        @NameInMap("Description")
        public String description;

        @NameInMap("FeatureList")
        public java.util.List<String> featureList;

        @NameInMap("ISP")
        public String ISP;

        @NameInMap("Name")
        public String name;

        @NameInMap("ZoneList")
        public java.util.List<String> zoneList;

        public static ListAPNsResponseBodyAPNs build(java.util.Map<String, ?> map) throws Exception {
            ListAPNsResponseBodyAPNs self = new ListAPNsResponseBodyAPNs();
            return TeaModel.build(map, self);
        }

        public ListAPNsResponseBodyAPNs setAPN(String APN) {
            this.APN = APN;
            return this;
        }
        public String getAPN() {
            return this.APN;
        }

        public ListAPNsResponseBodyAPNs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAPNsResponseBodyAPNs setFeatureList(java.util.List<String> featureList) {
            this.featureList = featureList;
            return this;
        }
        public java.util.List<String> getFeatureList() {
            return this.featureList;
        }

        public ListAPNsResponseBodyAPNs setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public ListAPNsResponseBodyAPNs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAPNsResponseBodyAPNs setZoneList(java.util.List<String> zoneList) {
            this.zoneList = zoneList;
            return this;
        }
        public java.util.List<String> getZoneList() {
            return this.zoneList;
        }

    }

}
