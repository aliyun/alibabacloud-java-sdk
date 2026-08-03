// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class ListDataEventSelectorsResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public ListDataEventSelectorsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8A74FD2E-A9B9-461C-BCE9-D9668DF1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataEventSelectorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataEventSelectorsResponseBody self = new ListDataEventSelectorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataEventSelectorsResponseBody setData(ListDataEventSelectorsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataEventSelectorsResponseBodyData getData() {
        return this.data;
    }

    public ListDataEventSelectorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataEventSelectorsResponseBodyDataDataEventSelectorInfosSlsDeliveryConfigs extends TeaModel {
        /**
         * <p>The time when the trail was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-30T16:11Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error code returned if the resource initialization fails.</p>
         * 
         * <strong>example:</strong>
         * <p>LogServiceException</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned if the resource initialization fails.</p>
         * 
         * <strong>example:</strong>
         * <p>RequestError Web request failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the SLS project in the region where events are delivered.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:log:cn-shanghai:159498693826****:project/actiontrail-log-159498693826****-cn-shanghai</p>
         */
        @NameInMap("RegionSlsProjectArn")
        public String regionSlsProjectArn;

        /**
         * <p>The initialization status of the tracked resource.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The region of the trail.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("TrailRegion")
        public String trailRegion;

        public static ListDataEventSelectorsResponseBodyDataDataEventSelectorInfosSlsDeliveryConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListDataEventSelectorsResponseBodyDataDataEventSelectorInfosSlsDeliveryConfigs self = new ListDataEventSelectorsResponseBodyDataDataEventSelectorInfosSlsDeliveryConfigs();
            return TeaModel.build(map, self);
        }

        public ListDataEventSelectorsResponseBodyDataDataEventSelectorInfosSlsDeliveryConfigs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDataEventSelectorsResponseBodyDataDataEventSelectorInfosSlsDeliveryConfigs setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListDataEventSelectorsResponseBodyDataDataEventSelectorInfosSlsDeliveryConfigs setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListDataEventSelectorsResponseBodyDataDataEventSelectorInfosSlsDeliveryConfigs setRegionSlsProjectArn(String regionSlsProjectArn) {
            this.regionSlsProjectArn = regionSlsProjectArn;
            return this;
        }
        public String getRegionSlsProjectArn() {
            return this.regionSlsProjectArn;
        }

        public ListDataEventSelectorsResponseBodyDataDataEventSelectorInfosSlsDeliveryConfigs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDataEventSelectorsResponseBodyDataDataEventSelectorInfosSlsDeliveryConfigs setTrailRegion(String trailRegion) {
            this.trailRegion = trailRegion;
            return this;
        }
        public String getTrailRegion() {
            return this.trailRegion;
        }

    }

    public static class ListDataEventSelectorsResponseBodyDataDataEventSelectorInfos extends TeaModel {
        /**
         * <p>The configuration of the data event selector. This parameter is a JSON array that can contain a maximum of 20 elements.</p>
         * <p>Each element in the JSON array includes the following fields:</p>
         * <ul>
         * <li><p><code>ServiceName</code>: The name of the Alibaba Cloud service that supports data events.</p>
         * </li>
         * <li><p><code>ReadWriteType</code>: The type of data event. Valid values: Read, Write, and All.</p>
         * </li>
         * <li><p><code>EventName</code>: This field contains the <code>Equals</code> and <code>NotEquals</code> subfields.</p>
         * <p>For example, the following configuration specifies that only <code>GetObject</code>, <code>CopyObject</code>, and <code>AppendObject</code>events are delivered:</p>
         * <p><code>{&quot;EventName&quot;:{&quot;Equals&quot;:[&quot;GetObject&quot;,&quot;CopyObject&quot;,&quot;AppendObject&quot;]}}</code></p>
         * <p>If you specify <code>NotEquals</code>, events other than <code>GetObject</code>, <code>CopyObject</code>, and <code>AppendObject</code> are delivered.</p>
         * </li>
         * <li><p><code>ResourceArn</code>: This field also contains the <code>Equals</code> and <code>NotEquals</code> subfields, similar to <code>EventName</code>. For example:</p>
         * <p><code>{&quot;ResourceArn&quot;:{&quot;Equals&quot;:[arn1,...,arnx]}}</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;EventName&quot;:{&quot;Equals&quot;:[&quot;GetObject&quot;,&quot;CopyObject&quot;,&quot;AppendObject&quot;]},&quot;ReadWriteType&quot;:&quot;All&quot;,&quot;ServiceName&quot;:&quot;Oss&quot;}]</p>
         */
        @NameInMap("EventSelectors")
        public String eventSelectors;

        /**
         * <p>Specifies whether the trail tracks data events in all regions.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsTrailAllRegion")
        public Boolean isTrailAllRegion;

        /**
         * <p>The list of configurations for delivering events to Simple Log Service (SLS).</p>
         */
        @NameInMap("SlsDeliveryConfigs")
        public java.util.List<ListDataEventSelectorsResponseBodyDataDataEventSelectorInfosSlsDeliveryConfigs> slsDeliveryConfigs;

        /**
         * <p>The ARN of the trail.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:actiontrail:cn-shanghai:159498693826****:trail/trail-name</p>
         */
        @NameInMap("TrailArn")
        public String trailArn;

        /**
         * <p>The name of the trail.</p>
         * 
         * <strong>example:</strong>
         * <p>trail-name</p>
         */
        @NameInMap("TrailName")
        public String trailName;

        public static ListDataEventSelectorsResponseBodyDataDataEventSelectorInfos build(java.util.Map<String, ?> map) throws Exception {
            ListDataEventSelectorsResponseBodyDataDataEventSelectorInfos self = new ListDataEventSelectorsResponseBodyDataDataEventSelectorInfos();
            return TeaModel.build(map, self);
        }

        public ListDataEventSelectorsResponseBodyDataDataEventSelectorInfos setEventSelectors(String eventSelectors) {
            this.eventSelectors = eventSelectors;
            return this;
        }
        public String getEventSelectors() {
            return this.eventSelectors;
        }

        public ListDataEventSelectorsResponseBodyDataDataEventSelectorInfos setIsTrailAllRegion(Boolean isTrailAllRegion) {
            this.isTrailAllRegion = isTrailAllRegion;
            return this;
        }
        public Boolean getIsTrailAllRegion() {
            return this.isTrailAllRegion;
        }

        public ListDataEventSelectorsResponseBodyDataDataEventSelectorInfos setSlsDeliveryConfigs(java.util.List<ListDataEventSelectorsResponseBodyDataDataEventSelectorInfosSlsDeliveryConfigs> slsDeliveryConfigs) {
            this.slsDeliveryConfigs = slsDeliveryConfigs;
            return this;
        }
        public java.util.List<ListDataEventSelectorsResponseBodyDataDataEventSelectorInfosSlsDeliveryConfigs> getSlsDeliveryConfigs() {
            return this.slsDeliveryConfigs;
        }

        public ListDataEventSelectorsResponseBodyDataDataEventSelectorInfos setTrailArn(String trailArn) {
            this.trailArn = trailArn;
            return this;
        }
        public String getTrailArn() {
            return this.trailArn;
        }

        public ListDataEventSelectorsResponseBodyDataDataEventSelectorInfos setTrailName(String trailName) {
            this.trailName = trailName;
            return this;
        }
        public String getTrailName() {
            return this.trailName;
        }

    }

    public static class ListDataEventSelectorsResponseBodyData extends TeaModel {
        /**
         * <p>A list of data event selectors.</p>
         */
        @NameInMap("DataEventSelectorInfos")
        public java.util.List<ListDataEventSelectorsResponseBodyDataDataEventSelectorInfos> dataEventSelectorInfos;

        /**
         * <p>The maximum number of entries returned for the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>VjE6bHJlTGoxdm1M****</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static ListDataEventSelectorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataEventSelectorsResponseBodyData self = new ListDataEventSelectorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataEventSelectorsResponseBodyData setDataEventSelectorInfos(java.util.List<ListDataEventSelectorsResponseBodyDataDataEventSelectorInfos> dataEventSelectorInfos) {
            this.dataEventSelectorInfos = dataEventSelectorInfos;
            return this;
        }
        public java.util.List<ListDataEventSelectorsResponseBodyDataDataEventSelectorInfos> getDataEventSelectorInfos() {
            return this.dataEventSelectorInfos;
        }

        public ListDataEventSelectorsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListDataEventSelectorsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
