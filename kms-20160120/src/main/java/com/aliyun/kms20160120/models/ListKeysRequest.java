// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListKeysRequest extends TeaModel {
    /**
     * <p>The CMK filter. The filter consists of one or more key-value pairs. You can specify a maximum of 10 key-value pairs.</p>
     * <br>
     * <p>*   Key</p>
     * <br>
     * <p>    *   Description: the property that you want to filter.</p>
     * <br>
     * <p>    *   Type: string.</p>
     * <br>
     * <p>    *   Valid values:</p>
     * <br>
     * <p>        *   KeyState: the status of the CMK.</p>
     * <p>        *   KeySpec: the type of the CMK.</p>
     * <p>        *   KeyUsage: the usage of the CMK.</p>
     * <p>        *   ProtectionLevel: the protection level.</p>
     * <p>        *   CreatorType: the type of the creator.</p>
     * <br>
     * <p>*   Values</p>
     * <br>
     * <p>    *   Description: the value to be included after filtering.</p>
     * <br>
     * <p>    *   Format: string array.</p>
     * <br>
     * <p>    *   Length: 0 to 10.</p>
     * <br>
     * <p>    *   Valid values:</p>
     * <br>
     * <p>        *   When Key is set to KeyState, the value can be Enabled, Disabled, PendingDeletion, or PendingImport.</p>
     * <br>
     * <p>        *   When Key is set to KeySpec, the value can be Aliyun_AES_256, Aliyun_SM4, RSA_2048, EC_P256, EC_P256K, or EC_SM2.</p>
     * <br>
     * <p>            Note: You can create CMKs of the EC_SM2 or Aliyun_SM4 type only in regions where State Cryptography Administration (SCA)-certified managed HSMs reside. For more information about the regions, see [Supported regions](https://help.aliyun.com/document_detail/125803.html). If your region does not support EC_SM2 or Aliyun_SM4, the two values are ignored if they are specified.</p>
     * <br>
     * <p>        *   When Key is set to KeyUsage, the value can be ENCRYPT/DECRYPT or SIGN/VERIFY. ENCRYPT/DECRYPT indicates that the CMK is used to encrypt and decrypt data. SIGN/VERIFY indicates that the CMK is used to generate and verify digital signatures.</p>
     * <br>
     * <p>        *   When Key is set to ProtectionLevel, the value can be SOFTWARE (software) or HSM (hardware).</p>
     * <br>
     * <p>            You can set ProtectionLevel to HSM in only specific regions. For more information about the regions, see [Supported regions](https://help.aliyun.com/document_detail/125803.html). If your region does not support the value HSM, the value is ignored if the value is specified.</p>
     * <br>
     * <p>        *   If Key is set to CreatorType, the value can be User or Service. User indicates that CMKs created by the current account are queried. Service indicates that CMKs automatically created by other cloud services authorized by the current account are queried.</p>
     * <br>
     * <p>The logical relationship between different keys is AND, and the logical relationship between multiple items in the same key is OR. Example:</p>
     * <br>
     * <p>`[ {"Key":"KeyState", "Values":["Enabled","Disabled"]}, {"Key":"KeyState", "Values":["PendingDeletion"]}, {"Key":"KeySpec", "Values":["Aliyun_AES_256"]}]`. In this example, the semantics are:`(KeyState=Enabled OR KeyState=Disabled OR KeyState=PendingDeletion) AND (KeySpec=Aliyun_AES_ 256)`.</p>
     */
    @NameInMap("Filters")
    public String filters;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKeysRequest self = new ListKeysRequest();
        return TeaModel.build(map, self);
    }

    public ListKeysRequest setFilters(String filters) {
        this.filters = filters;
        return this;
    }
    public String getFilters() {
        return this.filters;
    }

    public ListKeysRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListKeysRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
