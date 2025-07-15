// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsOnlineListRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs. You can view the application name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The main streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether to return only specific parameters. Valid values:</p>
     * <ul>
     * <li><strong>yes</strong>: returns only the DomainName, AppName, StreamName, and PublishTime parameters.</li>
     * <li><strong>no</strong>: returns all parameters. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>no</p>
     */
    @NameInMap("OnlyStream")
    public String onlyStream;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Valid values: 1 to 3000. Default value: 2000.</p>
     * 
     * <strong>example:</strong>
     * <p>1500</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The mode in which stream names are matched. Valid values:</p>
     * <ul>
     * <li><strong>fuzzy</strong> (default): fuzzy match</li>
     * <li><strong>strict</strong>: exact match</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fuzzy</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the live stream. You can specify only one live stream. You can view the stream name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    /**
     * <p>The type of the streams to query. Valid values:</p>
     * <ul>
     * <li><strong>all</strong> (default): all streams</li>
     * <li><strong>raw</strong>: source streams</li>
     * <li><strong>trans</strong>: transcoded streams</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("StreamType")
    public String streamType;

    public static DescribeLiveStreamsOnlineListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsOnlineListRequest self = new DescribeLiveStreamsOnlineListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsOnlineListRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeLiveStreamsOnlineListRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveStreamsOnlineListRequest setOnlyStream(String onlyStream) {
        this.onlyStream = onlyStream;
        return this;
    }
    public String getOnlyStream() {
        return this.onlyStream;
    }

    public DescribeLiveStreamsOnlineListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveStreamsOnlineListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveStreamsOnlineListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveStreamsOnlineListRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public DescribeLiveStreamsOnlineListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveStreamsOnlineListRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public DescribeLiveStreamsOnlineListRequest setStreamType(String streamType) {
        this.streamType = streamType;
        return this;
    }
    public String getStreamType() {
        return this.streamType;
    }

}
