// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetManagedDataKeyResponseBody extends TeaModel {
    /**
     * <p>The name of the managed data key (DK).</p>
     * 
     * <strong>example:</strong>
     * <p>example-data-key</p>
     */
    @NameInMap("DataKeyName")
    public String dataKeyName;

    /**
     * <p>The version number of the returned managed data key (DK).</p>
     * 
     * <strong>example:</strong>
     * <p>xH6OPUmz</p>
     */
    @NameInMap("DataKeyVersionId")
    public String dataKeyVersionId;

    /**
     * <p>The credential name that stores the key material of the returned managed data key (DK) version.</p>
     * 
     * <strong>example:</strong>
     * <p>kms-datakeyversion!example-data-key!xH6OPUmz</p>
     */
    @NameInMap("DataKeyVersionName")
    public String dataKeyVersionName;

    /**
     * <p>The Base64-encoding plaintext value of the data key (DK).</p>
     * 
     * <strong>example:</strong>
     * <p>CYueyVmZJ2MfA1VSZV2jCbFT8bO7StAvBnHacplr9aI=</p>
     */
    @NameInMap("Plaintext")
    public String plaintext;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique identifier for each request. You can use the request ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4bd560a1-729e-45f1-a3d9-b2a33d61046b</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetManagedDataKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetManagedDataKeyResponseBody self = new GetManagedDataKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetManagedDataKeyResponseBody setDataKeyName(String dataKeyName) {
        this.dataKeyName = dataKeyName;
        return this;
    }
    public String getDataKeyName() {
        return this.dataKeyName;
    }

    public GetManagedDataKeyResponseBody setDataKeyVersionId(String dataKeyVersionId) {
        this.dataKeyVersionId = dataKeyVersionId;
        return this;
    }
    public String getDataKeyVersionId() {
        return this.dataKeyVersionId;
    }

    public GetManagedDataKeyResponseBody setDataKeyVersionName(String dataKeyVersionName) {
        this.dataKeyVersionName = dataKeyVersionName;
        return this;
    }
    public String getDataKeyVersionName() {
        return this.dataKeyVersionName;
    }

    public GetManagedDataKeyResponseBody setPlaintext(String plaintext) {
        this.plaintext = plaintext;
        return this;
    }
    public String getPlaintext() {
        return this.plaintext;
    }

    public GetManagedDataKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
