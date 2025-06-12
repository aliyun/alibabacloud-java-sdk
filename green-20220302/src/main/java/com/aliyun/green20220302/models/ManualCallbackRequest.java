// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ManualCallbackRequest extends TeaModel {
    /**
     * <p>Channel field</p>
     * 
     * <strong>example:</strong>
     * <p>ant</p>
     */
    @NameInMap("Channel")
    public String channel;

    /**
     * <p>Checksum.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Checksum")
    public String checksum;

    /**
     * <p>Code value</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Result\&quot;: [{\&quot;Confidence\&quot;: 100.0, \&quot;CustomizedHit\&quot;: [{\&quot;KeyWords\&quot;: u\&quot;\u4fdd\u969c,\u6700\u5927,\u9ad8\u7ea7\&quot;, \&quot;LibName\&quot;: u\&quot;\u4f18\u8def\u654f\u611f\u8bcd\&quot;}], \&quot;Label\&quot;: \&quot;customized\&quot;}]}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Message information</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>Platform request ID, used for troubleshooting assistance</p>
     * 
     * <strong>example:</strong>
     * <p>B0963D30-BAB4-562F-9ED0-7A23AEC51C7C</p>
     */
    @NameInMap("ReqId")
    public String reqId;

    public static ManualCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        ManualCallbackRequest self = new ManualCallbackRequest();
        return TeaModel.build(map, self);
    }

    public ManualCallbackRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ManualCallbackRequest setChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }
    public String getChecksum() {
        return this.checksum;
    }

    public ManualCallbackRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ManualCallbackRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ManualCallbackRequest setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ManualCallbackRequest setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

}
