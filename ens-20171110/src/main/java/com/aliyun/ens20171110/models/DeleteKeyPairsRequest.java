// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteKeyPairsRequest extends TeaModel {
    /**
     * <p>The key pair name. The name must conform to the following naming conventions:</p>
     * <br>
     * <p>*   The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
     * <p>*   It can contain letters, digits, colons (:), underscores (\_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.</p>
     * <p>*   It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
     * <br>
     * <p>Before you delete a key pair, you can call the DescribeKeyPairs operation to query existing key pairs.</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    public static DeleteKeyPairsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeyPairsRequest self = new DeleteKeyPairsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKeyPairsRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

}
