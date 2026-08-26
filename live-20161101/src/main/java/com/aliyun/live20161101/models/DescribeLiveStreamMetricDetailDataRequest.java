// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamMetricDetailDataRequest extends TeaModel {
    /**
     * <p>The application name. Specify this parameter to query stream-level data for a specific application.</p>
     * <blockquote>
     * <p>If you specify StreamName, you must also specify AppName.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <ul>
     * <li>The accelerated domain name to query. Only a single domain name can be queried at a time. An error is returned if multiple domain names are specified.</li>
     * <li>If AppName and StreamName are not specified, stream-level data for all streams under the domain name is returned.</li>
     * <li>If the domain name is left empty, aggregate data for all accelerated domain names under the account is returned.</li>
     * <li>If DomainName is specified and both AppName and StreamName are set to all, aggregate data for the specified accelerated domain name is returned.</li>
     * <li>When you specify DomainName, make sure the domain name is a live streaming domain and the user calling this operation has the required permissions on the domain name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time, and the difference cannot exceed 1 day. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The paged query token. A maximum of 5,000 rows of data can be returned per query. If the data to query exceeds 5,000 rows, the response includes the starting index for the next paging request. Pass this token in the request to continue querying data from where the previous query ended.</p>
     * 
     * <strong>example:</strong>
     * <p>UjsM9x3aVcJi9a0-ArwJUTTC67CIBKLw*****</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The stream protocol. Valid values: <strong>flv</strong>, <strong>hls</strong>, <strong>rtmp</strong>, <strong>rts</strong>, and <strong>p2p</strong>.</p>
     * <p>You can query data for multiple protocols by separating them with commas (,). Data for multiple protocols is not aggregated and is output at the stream level.</p>
     * <blockquote>
     * <p>The <strong>rts</strong> option queries Real-Time Streaming (RTS) streams that use the ARTC protocol.</p>
     * <ul>
     * <li>When using rts, you may need to additionally collect statistics for the xxx_AliRTS-opus transcoding stream. This is because when playing an RTS stream on the web, a transcoding stream with the _AliRTS-opus suffix appended to the stream name is automatically generated. For more information, see <a href="https://help.aliyun.com/document_detail/2948703.html">RTS sub-second latency automatic transcoding</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>flv</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start of the time range to query. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The stream name. Specify this parameter together with AppName to return stream-level data.</p>
     * <blockquote>
     * <p>If you specify StreamName, you must also specify AppName.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static DescribeLiveStreamMetricDetailDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamMetricDetailDataRequest self = new DescribeLiveStreamMetricDetailDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamMetricDetailDataRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeLiveStreamMetricDetailDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveStreamMetricDetailDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveStreamMetricDetailDataRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public DescribeLiveStreamMetricDetailDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveStreamMetricDetailDataRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public DescribeLiveStreamMetricDetailDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveStreamMetricDetailDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveStreamMetricDetailDataRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}
