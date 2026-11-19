// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSwitchLogRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-uf68f1b5a57exxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The end time of the query. The end time must be later than the start time. The time is in the <i>yyyy-mm-dd</i>T<i>hh:mm</i>Z format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2023-05-28T02:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number. Valid values: an integer greater than 0 and less than or equal to the maximum value of the INTEGER data type. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>. Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The start time of the query. The time is in the <i>yyyy-mm-dd</i>T<i>hh:mm</i>Z format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2023-05-27T02:46Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBInstanceSwitchLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSwitchLogRequest self = new DescribeDBInstanceSwitchLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSwitchLogRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceSwitchLogRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBInstanceSwitchLogRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstanceSwitchLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBInstanceSwitchLogRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDBInstanceSwitchLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
