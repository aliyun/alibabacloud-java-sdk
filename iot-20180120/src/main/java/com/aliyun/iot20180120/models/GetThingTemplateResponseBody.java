// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The TSL features returned if the call is successful. Format:</p>
     * <pre><code>
     * {
     *   &quot;properties&quot;: [], //The list of properties
     *   &quot;services&quot;: [], //The list of services
     *   &quot;events&quot;: [], //The list of events
     * }
     *                                 
     * </code></pre>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/73727.html">TSL formats</a>.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>{ &quot;properties&quot;:[],&quot;services&quot;:[], &quot;events&quot;:[]}</p>
     */
    @NameInMap("ThingModelJSON")
    public String thingModelJSON;

    public static GetThingTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetThingTemplateResponseBody self = new GetThingTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetThingTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetThingTemplateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetThingTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetThingTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetThingTemplateResponseBody setThingModelJSON(String thingModelJSON) {
        this.thingModelJSON = thingModelJSON;
        return this;
    }
    public String getThingModelJSON() {
        return this.thingModelJSON;
    }

}
