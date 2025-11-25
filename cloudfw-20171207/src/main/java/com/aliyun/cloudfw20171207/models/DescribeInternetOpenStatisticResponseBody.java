// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetOpenStatisticResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("InternetIpNum")
    public Integer internetIpNum;

    /**
     * <strong>example:</strong>
     * <p>38</p>
     */
    @NameInMap("InternetPortNum")
    public Integer internetPortNum;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("InternetRiskIpNum")
    public Integer internetRiskIpNum;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("InternetRiskPortNum")
    public Integer internetRiskPortNum;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("InternetRiskServiceNum")
    public Integer internetRiskServiceNum;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("InternetServiceNum")
    public Integer internetServiceNum;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InternetSlbIpNum")
    public Integer internetSlbIpNum;

    /**
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("InternetSlbIpPortNum")
    public Integer internetSlbIpPortNum;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("InternetUnprotectedPortNum")
    public Integer internetUnprotectedPortNum;

    /**
     * <strong>example:</strong>
     * <p>6AB7822C-0D73-5D1D-81FD-45D4FB7C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInternetOpenStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetOpenStatisticResponseBody self = new DescribeInternetOpenStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInternetOpenStatisticResponseBody setInternetIpNum(Integer internetIpNum) {
        this.internetIpNum = internetIpNum;
        return this;
    }
    public Integer getInternetIpNum() {
        return this.internetIpNum;
    }

    public DescribeInternetOpenStatisticResponseBody setInternetPortNum(Integer internetPortNum) {
        this.internetPortNum = internetPortNum;
        return this;
    }
    public Integer getInternetPortNum() {
        return this.internetPortNum;
    }

    public DescribeInternetOpenStatisticResponseBody setInternetRiskIpNum(Integer internetRiskIpNum) {
        this.internetRiskIpNum = internetRiskIpNum;
        return this;
    }
    public Integer getInternetRiskIpNum() {
        return this.internetRiskIpNum;
    }

    public DescribeInternetOpenStatisticResponseBody setInternetRiskPortNum(Integer internetRiskPortNum) {
        this.internetRiskPortNum = internetRiskPortNum;
        return this;
    }
    public Integer getInternetRiskPortNum() {
        return this.internetRiskPortNum;
    }

    public DescribeInternetOpenStatisticResponseBody setInternetRiskServiceNum(Integer internetRiskServiceNum) {
        this.internetRiskServiceNum = internetRiskServiceNum;
        return this;
    }
    public Integer getInternetRiskServiceNum() {
        return this.internetRiskServiceNum;
    }

    public DescribeInternetOpenStatisticResponseBody setInternetServiceNum(Integer internetServiceNum) {
        this.internetServiceNum = internetServiceNum;
        return this;
    }
    public Integer getInternetServiceNum() {
        return this.internetServiceNum;
    }

    public DescribeInternetOpenStatisticResponseBody setInternetSlbIpNum(Integer internetSlbIpNum) {
        this.internetSlbIpNum = internetSlbIpNum;
        return this;
    }
    public Integer getInternetSlbIpNum() {
        return this.internetSlbIpNum;
    }

    public DescribeInternetOpenStatisticResponseBody setInternetSlbIpPortNum(Integer internetSlbIpPortNum) {
        this.internetSlbIpPortNum = internetSlbIpPortNum;
        return this;
    }
    public Integer getInternetSlbIpPortNum() {
        return this.internetSlbIpPortNum;
    }

    public DescribeInternetOpenStatisticResponseBody setInternetUnprotectedPortNum(Integer internetUnprotectedPortNum) {
        this.internetUnprotectedPortNum = internetUnprotectedPortNum;
        return this;
    }
    public Integer getInternetUnprotectedPortNum() {
        return this.internetUnprotectedPortNum;
    }

    public DescribeInternetOpenStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
