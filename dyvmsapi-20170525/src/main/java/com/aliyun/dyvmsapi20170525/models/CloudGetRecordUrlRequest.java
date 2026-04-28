// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudGetRecordUrlRequest extends TeaModel {
    /**
     * <p>呼叫类型；说明：开启分线录音时，获取客户侧或座席侧录音需要，recordFormat=1时有效，recordFormat=0时忽略。取值范围：1,2,4,5（数字含义：呼入,webcall,预览外呼,预测外呼）</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("CallType")
    public Long callType;

    /**
     * <p>是否下载；１为下载，空或０表示试听</p>
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
     * <p>7000002</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>录音文件名；如7000101-20160815140025-01087120766-01087120766--record-sip-1-1471240825.87</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000101-20160815140025-01087120766-01087120766--record-sip-1-1471240825.87</p>
     */
    @NameInMap("RecordFile")
    public String recordFile;

    /**
     * <p>录音文件类型；取值说明：0为mp3，1为wav，默认为mp3类型</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RecordFormat")
    public Long recordFormat;

    /**
     * <p>分线录音录音侧；说明：开启分线录音时，获取客户侧或座席侧录音需要，recordFormat=1时有效，recordFormat=0时忽略。取值范围：1,2 (数字含义：客户侧，座席侧)recordSide不为空时，callType必选</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RecordSide")
    public Long recordSide;

    /**
     * <p>录音类型，不填可根据 recordFile 解析；record:录音voicemail:留言tsi:彩铃、当开启号码录音状态识别，发起预览外呼，客户号码是手机且客户未接听时返回该地址 rasr:语音机器人客户侧录音 transfer:转接consult:咨询threeway:三方</p>
     * 
     * <strong>example:</strong>
     * <p>record</p>
     */
    @NameInMap("RecordType")
    public String recordType;

    public static CloudGetRecordUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudGetRecordUrlRequest self = new CloudGetRecordUrlRequest();
        return TeaModel.build(map, self);
    }

    public CloudGetRecordUrlRequest setCallType(Long callType) {
        this.callType = callType;
        return this;
    }
    public Long getCallType() {
        return this.callType;
    }

    public CloudGetRecordUrlRequest setDownload(Long download) {
        this.download = download;
        return this;
    }
    public Long getDownload() {
        return this.download;
    }

    public CloudGetRecordUrlRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudGetRecordUrlRequest setRecordFile(String recordFile) {
        this.recordFile = recordFile;
        return this;
    }
    public String getRecordFile() {
        return this.recordFile;
    }

    public CloudGetRecordUrlRequest setRecordFormat(Long recordFormat) {
        this.recordFormat = recordFormat;
        return this;
    }
    public Long getRecordFormat() {
        return this.recordFormat;
    }

    public CloudGetRecordUrlRequest setRecordSide(Long recordSide) {
        this.recordSide = recordSide;
        return this;
    }
    public Long getRecordSide() {
        return this.recordSide;
    }

    public CloudGetRecordUrlRequest setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }
    public String getRecordType() {
        return this.recordType;
    }

}
