// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkDescribeRecordFileUrlRequest extends TeaModel {
    /**
     * <p>０表示试听，１为下载，默认为1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Download")
    public Long download;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8004970</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>通话记录唯一标识</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>uniq_1-162046xxxx.12</p>
     */
    @NameInMap("MainUniqueId")
    public String mainUniqueId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>不传递获取mp3格式录音，传递时获取wav格式录音。1：双轨录音客户侧，2：双轨录音座席侧，3：两侧合成录音</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RecordSide")
    public Long recordSide;

    /**
     * <p>录音类型。 &quot;record&quot;: 通话录音，&quot;voicemail&quot;: 留言。默认值为 &quot;record&quot;</p>
     * 
     * <strong>example:</strong>
     * <p>record</p>
     */
    @NameInMap("RecordType")
    public String recordType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>获取录音地址超时时长，单位为秒，默认为一小时，范围在一到二十四小时。</p>
     * 
     * <strong>example:</strong>
     * <p>67</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    public static ClinkDescribeRecordFileUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        ClinkDescribeRecordFileUrlRequest self = new ClinkDescribeRecordFileUrlRequest();
        return TeaModel.build(map, self);
    }

    public ClinkDescribeRecordFileUrlRequest setDownload(Long download) {
        this.download = download;
        return this;
    }
    public Long getDownload() {
        return this.download;
    }

    public ClinkDescribeRecordFileUrlRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public ClinkDescribeRecordFileUrlRequest setMainUniqueId(String mainUniqueId) {
        this.mainUniqueId = mainUniqueId;
        return this;
    }
    public String getMainUniqueId() {
        return this.mainUniqueId;
    }

    public ClinkDescribeRecordFileUrlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ClinkDescribeRecordFileUrlRequest setRecordSide(Long recordSide) {
        this.recordSide = recordSide;
        return this;
    }
    public Long getRecordSide() {
        return this.recordSide;
    }

    public ClinkDescribeRecordFileUrlRequest setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }
    public String getRecordType() {
        return this.recordType;
    }

    public ClinkDescribeRecordFileUrlRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ClinkDescribeRecordFileUrlRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ClinkDescribeRecordFileUrlRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}
