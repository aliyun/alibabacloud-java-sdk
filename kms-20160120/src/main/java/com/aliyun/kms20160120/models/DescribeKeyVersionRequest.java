// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeKeyVersionRequest extends TeaModel {
    /**
     * <p>The globally unique ID of the CMK.</p>
     * <p>You can also set this parameter to an alias that is bound to the CMK. For more information, see <a href="https://help.aliyun.com/document_detail/68522.html">Alias overview</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234abcd-12ab-34cd-56ef-12345678****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The globally unique ID of the CMK version.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/133966.html">ListKeyVersions</a> operation to query the versions of the CMK.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2ab1a983-7072-4bbc-a582-584b5bd8****</p>
     */
    @NameInMap("KeyVersionId")
    public String keyVersionId;

    public static DescribeKeyVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyVersionRequest self = new DescribeKeyVersionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKeyVersionRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public DescribeKeyVersionRequest setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
        return this;
    }
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

}
