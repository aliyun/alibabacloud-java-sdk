// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamRecordIndexFileRequest extends TeaModel {
    /**
     * <p>System-defined parameter. Value: <strong>DescribeLiveStreamRecordIndexFile</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>ApsaraVideo Live stores the configuration information of an M3U8 index file for six months. You can query only index files created in the previous six months. M3U8 index files are stored in Object Storage Service (OSS) buckets. The retention period is determined by the storage configuration of the OSS buckets.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the index file.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2847890.html">DescribeLiveStreamRecordIndexFiles</a> operation to query the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c4d7f0a4-b506-43f9-8de3-07732c3f****</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The main domain of the live stream.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static DescribeLiveStreamRecordIndexFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamRecordIndexFileRequest self = new DescribeLiveStreamRecordIndexFileRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamRecordIndexFileRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeLiveStreamRecordIndexFileRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveStreamRecordIndexFileRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveStreamRecordIndexFileRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public DescribeLiveStreamRecordIndexFileRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeLiveStreamRecordIndexFileRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}
