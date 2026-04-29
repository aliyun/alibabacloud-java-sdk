// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateAsrRequest extends TeaModel {
    /**
     * <p>通话类型；1:呼入,2:webcall,4:预览外呼,5:预测外呼,6:主叫外呼,9:内部呼叫</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CallType")
    public Long callType;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000002</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>主通道的唯一标识</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sip-2-1489989807.36601</p>
     */
    @NameInMap("MainUniqueId")
    public String mainUniqueId;

    /**
     * <p>录音文件名；例: 7000002-20170320140327-1581-1500-record-sip-2-148998.366</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000002-20170320140327-1581-1500-record-sip-2-148998.366</p>
     */
    @NameInMap("RecordFile")
    public String recordFile;

    /**
     * <p>录音通道类型；取值范围：0：混音 1：分线录音时客户侧,2：分线录音时座席侧,3:分线录音时客户侧和座席侧</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RecordSide")
    public Long recordSide;

    /**
     * <p>语音文件类型,取值：record,voicemail 说明：record是录音， voicemail是留言</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>record</p>
     */
    @NameInMap("RecordType")
    public String recordType;

    /**
     * <p>当wav过期时，是否支持使用mp3进行转写；0-不支持（默认）；1-代表支持，如果通话wav过期，则自动使用mp3转写，转写结果中通道类型会被设置为混音类型；混音mp3无法区分两侧，双声道mp3可以区分两侧内容</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SupportMp3")
    public String supportMp3;

    /**
     * <p>从通道的唯一标识</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sip-2-1489989807.36601</p>
     */
    @NameInMap("UniqueId")
    public String uniqueId;

    public static CloudCreateAsrRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateAsrRequest self = new CloudCreateAsrRequest();
        return TeaModel.build(map, self);
    }

    public CloudCreateAsrRequest setCallType(Long callType) {
        this.callType = callType;
        return this;
    }
    public Long getCallType() {
        return this.callType;
    }

    public CloudCreateAsrRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudCreateAsrRequest setMainUniqueId(String mainUniqueId) {
        this.mainUniqueId = mainUniqueId;
        return this;
    }
    public String getMainUniqueId() {
        return this.mainUniqueId;
    }

    public CloudCreateAsrRequest setRecordFile(String recordFile) {
        this.recordFile = recordFile;
        return this;
    }
    public String getRecordFile() {
        return this.recordFile;
    }

    public CloudCreateAsrRequest setRecordSide(Long recordSide) {
        this.recordSide = recordSide;
        return this;
    }
    public Long getRecordSide() {
        return this.recordSide;
    }

    public CloudCreateAsrRequest setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }
    public String getRecordType() {
        return this.recordType;
    }

    public CloudCreateAsrRequest setSupportMp3(String supportMp3) {
        this.supportMp3 = supportMp3;
        return this;
    }
    public String getSupportMp3() {
        return this.supportMp3;
    }

    public CloudCreateAsrRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

}
