// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeKeyPairsRequest extends TeaModel {
    @NameInMap("KeyPairId")
    public String keyPairId;

    /**
     * <p>The name of the key pair. The name must be 2 to 128 characters in length. The name must start with a letter but cannot start with `http://` or `https://`. The name can contain the following characters:</p>
     * <br>
     * <p>*   Digits</p>
     * <p>*   :</p>
     * <p>*   \_</p>
     * <p>*   *</p>
     * <br>
     * <p>You can specify only one name. By default, all key pairs are queried.</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The page number of the returned page. Valid values: integers that are greater than 0. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page. Valid values: integers that are greater than 0. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    public static DescribeKeyPairsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyPairsRequest self = new DescribeKeyPairsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKeyPairsRequest setKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
        return this;
    }
    public String getKeyPairId() {
        return this.keyPairId;
    }

    public DescribeKeyPairsRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public DescribeKeyPairsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeKeyPairsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
