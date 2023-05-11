// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The TSL features returned if the call is successful. Format:</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>{</p>
     * <p>  "properties": [], //The list of properties</p>
     * <p>  "services": [], //The list of services</p>
     * <p>  "events": [], //The list of events</p>
     * <p>}</p>
     * <p>                                </p>
     * <p>```</p>
     * <br>
     * <p>For more information, see [TSL formats](~~73727~~).</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
