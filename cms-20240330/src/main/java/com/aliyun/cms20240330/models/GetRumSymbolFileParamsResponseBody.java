// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetRumSymbolFileParamsResponseBody extends TeaModel {
    /**
     * <p>The collection of signature parameters required for form upload, including key, policy, x-oss-signature-version, x-oss-credential, x-oss-date, and x-oss-signature. The signatures in the examples are for illustration purposes only and cannot be used for actual uploads. Use the complete parameters returned by the API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;user/workspace/service-id/1.0.0/build-1/bundle.js.map&quot;,&quot;policy&quot;:&quot;eyJleHBpcmF0aW9uIjoiMjAyNi0wNi0wM1QxMjozMDowMC4wMDBaIiwiY29uZGl0aW9ucyI6W3siYnVja2V0IjoiYnVja2V0In0seyJ4LW9zcy1zaWduYXR1cmUtdmVyc2lvbiI6Ik9TUzQtSE1BQy1TSEEyNTYifSx7Ingtb3NzLWNyZWRlbnRpYWwiOiJBS0lERVhBTVBMRS8yMDI2MDYwMy9jbi1oYW5nemhvdS9vc3MvYWxpeXVuX3Y0X3JlcXVlc3QifSx7Ingtb3NzLWRhdGUiOiIyMDI2MDYwM1QxMjAwMDBaIn0sWyJlcSIsIiRrZXkiLCJ1c2VyL3dvcmtzcGFjZS9zZXJ2aWNlLWlkLzEuMC4wL2J1aWxkLTEvYnVuZGxlLmpzLm1hcCJdLFsiY29udGVudC1sZW5ndGgtcmFuZ2UiLDEsNTI0Mjg4MDAwXV19&quot;,&quot;x-oss-signature-version&quot;:&quot;OSS4-HMAC-SHA256&quot;,&quot;x-oss-credential&quot;:&quot;AKIDEXAMPLE/20260603/cn-hangzhou/oss/aliyun_v4_request&quot;,&quot;x-oss-date&quot;:&quot;20260603T120000Z&quot;,&quot;x-oss-signature&quot;:&quot;0000000000000000000000000000000000000000000000000000000000000000&quot;}</p>
     */
    @NameInMap("formData")
    public java.util.Map<String, String> formData;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>request-1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The form upload URL for directly uploading symbol files to OSS.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://bucket.oss-cn-hangzhou.aliyuncs.com">https://bucket.oss-cn-hangzhou.aliyuncs.com</a></p>
     */
    @NameInMap("uploadUrl")
    public String uploadUrl;

    public static GetRumSymbolFileParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRumSymbolFileParamsResponseBody self = new GetRumSymbolFileParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRumSymbolFileParamsResponseBody setFormData(java.util.Map<String, String> formData) {
        this.formData = formData;
        return this;
    }
    public java.util.Map<String, String> getFormData() {
        return this.formData;
    }

    public GetRumSymbolFileParamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRumSymbolFileParamsResponseBody setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }
    public String getUploadUrl() {
        return this.uploadUrl;
    }

}
