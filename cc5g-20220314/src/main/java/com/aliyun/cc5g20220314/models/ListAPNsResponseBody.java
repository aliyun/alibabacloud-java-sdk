// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListAPNsResponseBody extends TeaModel {
    @NameInMap("APNs")
    public java.util.List<ListAPNsResponseBodyAPNs> APNs;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <strong>example:</strong>
     * <p>vhNxI+jwQfkLCUChCQ+iOoiRkyUbtAilGSvWuwktFBxF+bar2HpV0efI6n1+GkMv</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>A175C091-3910-51AF-8D84-D5717B9B8D38</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

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

    public ListAPNsResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
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

    public ListAPNsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListAPNsResponseBodyAPNs extends TeaModel {
        /**
         * <p>代表资源名称的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>zjhzaliyun01s.5gjs.njiot</p>
         */
        @NameInMap("APN")
        public String APN;

        @NameInMap("Description")
        public String description;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>unicom</p>
         */
        @NameInMap("ISP")
        public String ISP;

        /**
         * <p>代表创建时间的资源属性字段</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Zones")
        public java.util.List<String> zones;

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

        public ListAPNsResponseBodyAPNs setZones(java.util.List<String> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<String> getZones() {
            return this.zones;
        }

    }

}
