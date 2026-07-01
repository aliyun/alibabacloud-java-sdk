// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryDigitalSignByNameResponseBody extends TeaModel {
    /**
     * <p>Details of the access denial. This parameter is returned only if Resource Access Management (RAM) authentication fails.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code of the request. A value of <code>OK</code> indicates that the request was successful. Other values indicate error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <ul>
     * <li><p><code>gmtModified</code>: The time when the signature was last modified.</p>
     * </li>
     * <li><p><code>creator</code>: The ID of the user who created the signature.</p>
     * </li>
     * <li><p><code>signName</code>: The name of the digital SMS signature.</p>
     * </li>
     * <li><p><code>qualificationId</code>: The ID of the qualification. You can create qualifications in the console or by calling an API operation.</p>
     * </li>
     * <li><p><code>signIndustry</code>: The industry type. Valid values: <code>0</code> (General) and <code>1</code> (E-commerce).</p>
     * </li>
     * <li><p><code>signVersion</code>: The version of the signature. This value is updated for each new version. The current version is 1.</p>
     * </li>
     * <li><p><code>telecomRegisterStatus</code>: The filing status with China Telecom. Valid values: <code>0</code> (Filing Failed), <code>3</code> (Filing Successful), <code>-1</code> (Filing in Progress), and <code>-2</code> (Not Filed).</p>
     * </li>
     * <li><p><code>signCode</code>: The code of the digital SMS signature.</p>
     * </li>
     * <li><p><code>gmtCreate</code>: The time when the signature was created.</p>
     * </li>
     * <li><p><code>signId</code>: The ID of the signature. This is a unique identifier.</p>
     * </li>
     * <li><p><code>mobileRegisterStatus</code>: The filing status with China Mobile.</p>
     * </li>
     * <li><p><code>SignSource</code>: The source of the signature. Valid values:</p>
     * </li>
     * <li><p><code>mobileAvailableStatus</code>: The availability status with China Mobile. Valid values: <code>0</code> (Unavailable) and <code>1</code> (Available). We recommend that you select an available signature when you create a template or send a digital SMS message.</p>
     * </li>
     * <li><p><code>unicomRegisterStatus</code>: The filing status with China Unicom. Valid values: <code>0</code> (Filing Failed), <code>3</code> (Filing Successful), <code>-1</code> (Filing in Progress), and <code>-2</code> (Not Filed).</p>
     * </li>
     * <li><p><code>unicomAvailableStatus</code>: The availability status with China Unicom. Valid values: <code>0</code> (Unavailable) and <code>1</code> (Available). We recommend that you select an available signature when you create a template or send a digital SMS message.</p>
     * </li>
     * <li><p><code>telecomAvailableStatus</code>: The availability status with China Telecom. Valid values: <code>0</code> (Unavailable) and <code>1</code> (Available). We recommend that you select an available signature when you create a template or send a digital SMS message.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;Data&quot;: {
     *     &quot;gmtModified&quot;: 1770005896000,
     *     &quot;creator&quot;: &quot;UID:1498275912899720&quot;,
     *     &quot;signName&quot;: &quot;驳回理由&quot;,
     *     &quot;qualificationId&quot;: 2757722,
     *     &quot;qualificationVersion&quot;: 1768974751432,
     *     &quot;signIndustry&quot;: 0,
     *     &quot;registerStatueReason&quot;: {},
     *     &quot;signVersion&quot;: 1,
     *     &quot;remark&quot;: &quot;&quot;,
     *     &quot;telecomRegisterStatus&quot;: -1,
     *     &quot;signCode&quot;: &quot;DIGSIGN_100000168688001_1769050485148_pYZu1&quot;,
     *     &quot;gmtCreate&quot;: 1769050485000,
     *     &quot;signId&quot;: 22784769,
     *     &quot;mobileRegisterStatus&quot;: -1,
     *     &quot;signSource&quot;: 0,
     *     &quot;mobileAvailableStatus&quot;: 0,
     *     &quot;attachmentList&quot;: [],
     *     &quot;unicomRegisterStatus&quot;: 3,
     *     &quot;unicomAvailableStatus&quot;: 1,
     *     &quot;signType&quot;: 1,
     *     &quot;telecomAvailableStatus&quot;: 0,
     *     &quot;extendMessage&quot;: &quot;{}&quot;
     *   },</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDigitalSignByNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalSignByNameResponseBody self = new QueryDigitalSignByNameResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDigitalSignByNameResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryDigitalSignByNameResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDigitalSignByNameResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public QueryDigitalSignByNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDigitalSignByNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDigitalSignByNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
