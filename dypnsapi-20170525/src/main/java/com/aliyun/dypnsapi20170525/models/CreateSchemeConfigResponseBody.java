// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSchemeConfigResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>If OK is returned, the request is successful.</li>
     * <li>For more information about other error codes, see <a href="https://help.aliyun.com/zh/pnvs/developer-reference/api-return-code?spm=a2c4g.11186623.0.0.5c3a662fbgeAuk">API response codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Model")
    public CreateSchemeConfigResponseBodyModel model;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B95B36EC-8108-4479-D3AA-2BB27F9B155A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateSchemeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSchemeConfigResponseBody self = new CreateSchemeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSchemeConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSchemeConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSchemeConfigResponseBody setModel(CreateSchemeConfigResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public CreateSchemeConfigResponseBodyModel getModel() {
        return this.model;
    }

    public CreateSchemeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSchemeConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSchemeConfigResponseBodyModel extends TeaModel {
        /**
         * <p>The service code.</p>
         * 
         * <strong>example:</strong>
         * <p>FA100000168468035</p>
         */
        @NameInMap("SchemeCode")
        public String schemeCode;

        public static CreateSchemeConfigResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CreateSchemeConfigResponseBodyModel self = new CreateSchemeConfigResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public CreateSchemeConfigResponseBodyModel setSchemeCode(String schemeCode) {
            this.schemeCode = schemeCode;
            return this;
        }
        public String getSchemeCode() {
            return this.schemeCode;
        }

    }

}
