// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineRuntimeInfoResponseBody extends TeaModel {
    /**
     * <p>The status code. A return value of &quot;Success&quot; indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Hotline runtime information.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;buId&quot;:905,&quot;phoneToken&quot;:&quot;roESVzzgD1ytmG0W6nMkWinI6fbpKovm14fBhA0NsYPyi/srX/G0SvNB2z96AYiqy1vxQHiaFOdZSxtsAubdgr2kjs2yas7COO5dukQpsOLq9iNI4U6sKlcvaBi8xsyUr/hyqCdTVZDcYCOq0lH6eeNIQK/f7/gWqIw****=&quot;,&quot;isNeedWorkShift&quot;:false,&quot;servicerId&quot;:741018,&quot;accConfigUrl&quot;:&quot;pre-acc-cs-public.alibaba-inc.com&quot;,&quot;agentBasicCode&quot;:&quot;AgentCheckout&quot;,&quot;startWorkToReady&quot;:true,&quot;servicerDn&quot;:&quot;2000000001904123&quot;,&quot;isMaster&quot;:&quot;1&quot;,&quot;tenantId&quot;:2001,&quot;depId&quot;:1139139,&quot;accTenantId&quot;:2001,&quot;phoneData&quot;:&quot;{\&quot;timeStamp\&quot;:164240****,\&quot;expireTime\&quot;:164257****,\&quot;dn\&quot;:\&quot;200000000190****\&quot;,\&quot;source\&quot;:\&quot;xspace\&quot;,\&quot;serviceId\&quot;:741018}&quot;,&quot;agentBasicDesc&quot;:&quot;坐席签出状态&quot;}</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    /**
     * <p>Description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetHotlineRuntimeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineRuntimeInfoResponseBody self = new GetHotlineRuntimeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotlineRuntimeInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotlineRuntimeInfoResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public GetHotlineRuntimeInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotlineRuntimeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotlineRuntimeInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
