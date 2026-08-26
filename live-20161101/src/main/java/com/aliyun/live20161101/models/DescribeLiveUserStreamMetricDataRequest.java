// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveUserStreamMetricDataRequest extends TeaModel {
    /**
     * <p>The application name. Specify the application name to query stream-level data for the corresponding application. If <code>StreamName</code> is specified, <code>AppName</code> must also be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The streaming domain to query.</p>
     * <blockquote>
     * <p>Only a single domain name is supported. An error is returned if multiple domain names are specified. If the domain name is empty, aggregate data for all streaming domains under the user is queried. If <code>AppName</code> and <code>StreamName</code> are not specified, stream-level data for all streams under the domain is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time and the difference cannot exceed 1 day. Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 5000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The stream protocol name. Specify the protocol name to query data for the corresponding protocol. Supported protocols: <code>flv</code>, <code>hls</code>, <code>rtmp</code>, <code>rts</code>, <code>p2p</code>. You can query data for multiple protocols by separating them with commas (,). Data for multiple protocols is not aggregated and is output at the stream level.</p>
     * <blockquote>
     * <p>The <strong>rts</strong> option queries Real-Time Streaming (RTS) streams using the ARTC protocol.</p>
     * <ul>
     * <li>When using rts, you may need to additionally count the xxx_AliRTS-opus transcoding stream. This is because when playing an RTS stream on the web, a transcoding stream with the _AliRTS-opus suffix appended to the stream name is automatically generated, producing transcoding stream data. For more information, see <a href="https://help.aliyun.com/document_detail/2948703.html">RTS sub-second latency automatic transcoding</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>flv</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The stream name. If <code>StreamName</code> is specified, stream-level data for the specified <code>StreamName</code> under the specified <code>AppName</code> is returned. If <code>StreamName</code> is specified, <code>AppName</code> must also be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>test.flv</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static DescribeLiveUserStreamMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveUserStreamMetricDataRequest self = new DescribeLiveUserStreamMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveUserStreamMetricDataRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeLiveUserStreamMetricDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveUserStreamMetricDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveUserStreamMetricDataRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLiveUserStreamMetricDataRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveUserStreamMetricDataRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public DescribeLiveUserStreamMetricDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveUserStreamMetricDataRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}
