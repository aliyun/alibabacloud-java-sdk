// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListCurlLogRequest extends TeaModel {
    /**
     * <p>查询结束时间；格式:&quot;yyyy-MM-dd HH:mm:ss&quot;,精确到s。startTime与endTime不允许跨月，默认值取当前月份最后一天</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-23 10:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

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
     * <p>需要取出的数据条数；大于0，最大不能超过500，默认10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public String limit;

    /**
     * <p>推送结果；取值：1、成功，0、失败</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Result")
    public Long result;

    /**
     * <p>重试次数；默认-2</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Retry")
    public Long retry;

    /**
     * <p>从第几条开始取；大于等于0，默认0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Start")
    public String start;

    /**
     * <p>查询开始时间；格式:&quot;yyyy-MM-dd HH:mm:ss&quot;,精确到s。startTime与endTime不允许跨月，默认值取当前月份第一天</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-20 10:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>推送类型；1:来电推送、2:来电响铃推送、3:外呼响铃推送、4:webcall转座席响铃推送、5:来电接通推送、6:外呼接通推送、7:来电挂机推送、8:外呼挂机推送、9:座席状态推送、10:按键推送、11:号码状态识别推送、12:录音状态推送、13:HTTP交互推送、15:ASR语音转换结果推送、14:预测式外呼任务推送、16:webcall客户侧响铃推送、17:满意度调查推送、18:预测外呼客户接听状态推送、19:NLU推送、20:预测外呼双方接听推送、21:IVR交互结束推送、22:外呼客户响铃推送、23:webcall客户接听推送、24:webcall转接响铃推送、25:webcall转接接通推送、26:主叫外呼分机响铃推送、27:主叫外呼分机接听推送、28:主叫外呼客户响铃推送、29:主叫外呼双方接通推送</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public Long type;

    /**
     * <p>推送的url；说明：目的URL</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Url")
    public String url;

    public static CloudListCurlLogRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudListCurlLogRequest self = new CloudListCurlLogRequest();
        return TeaModel.build(map, self);
    }

    public CloudListCurlLogRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CloudListCurlLogRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudListCurlLogRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public CloudListCurlLogRequest setResult(Long result) {
        this.result = result;
        return this;
    }
    public Long getResult() {
        return this.result;
    }

    public CloudListCurlLogRequest setRetry(Long retry) {
        this.retry = retry;
        return this;
    }
    public Long getRetry() {
        return this.retry;
    }

    public CloudListCurlLogRequest setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

    public CloudListCurlLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CloudListCurlLogRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public CloudListCurlLogRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
