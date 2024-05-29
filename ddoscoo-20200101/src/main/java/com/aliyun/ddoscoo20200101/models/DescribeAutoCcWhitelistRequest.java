// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAutoCcWhitelistRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>> You can call the [DescribeInstanceIds](https://help.aliyun.com/document_detail/157459.html) operation to query the IDs of all instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The keyword for the query. This keyword is used to specify the prefix of the source IP address that you want to query.</p>
     * <br>
     * <p>> The keyword must be greater than three characters in length.</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>The number of the page to return. For example, to query the returned results on the first page, set the value to **1**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeAutoCcWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoCcWhitelistRequest self = new DescribeAutoCcWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutoCcWhitelistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAutoCcWhitelistRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public DescribeAutoCcWhitelistRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoCcWhitelistRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
