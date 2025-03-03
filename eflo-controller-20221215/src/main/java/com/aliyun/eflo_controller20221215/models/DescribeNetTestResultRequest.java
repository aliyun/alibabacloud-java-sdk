// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeNetTestResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dr-uf6i0tv2refv8wz*****</p>
     */
    @NameInMap("TestId")
    public String testId;

    public static DescribeNetTestResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetTestResultRequest self = new DescribeNetTestResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetTestResultRequest setTestId(String testId) {
        this.testId = testId;
        return this;
    }
    public String getTestId() {
        return this.testId;
    }

}
