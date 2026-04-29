// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudAgentMonitorStatisticsRequest extends TeaModel {
    /**
     * <p>说明：根据座席工号查询指定座席的统计项名称支持按照多个座席工号进行查询，多个座席工号之间使用英文逗号&quot;,&quot;分隔，默认查询账户下所有座席的统计信息</p>
     * 
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("Cnos")
    public String cnos;

    /**
     * <p>统计时间段；正整数，1～24，最大值是24时</p>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("EndHour")
    public Long endHour;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000002</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>统计项名称；取队列实时统计的统计字段名称，多个队列统计项之间使用英文逗号&quot;,&quot;分隔，默认查询所有统计项</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Fields")
    public String fields;

    /**
     * <p>说明：根据外呼组编号查询指定座席的统计项名称支持按照多个外呼组编号进行查询，多个座席工号之间使用英文逗号&quot;,&quot;分隔，默认查询账户下所有座席的统计信息</p>
     * 
     * <strong>example:</strong>
     * <p>WH123</p>
     */
    @NameInMap("Gno")
    public String gno;

    /**
     * <p>是否需要返回队列名称；0：不需要（默认） 1：需要</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsNeedQueueName")
    public String isNeedQueueName;

    /**
     * <p>是否需要外呼组查询；说明：0 关闭外呼组查询，1 开启外呼组查询。默认为关闭状态</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsUseGno")
    public Long isUseGno;

    /**
     * <p>条数；正整数，默认值是10，最大值是500</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>查询页码数的起始条数；正整数，默认值是0；与limit同步使用，例：offset=50,limit=10,表示查询第6页，每页10条数据，即总记录的第51-60条数据</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public Long offset;

    /**
     * <p>统计时间段；正整数，0～23，最大值是23时</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartHour")
    public Long startHour;

    public static CloudAgentMonitorStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudAgentMonitorStatisticsRequest self = new CloudAgentMonitorStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public CloudAgentMonitorStatisticsRequest setCnos(String cnos) {
        this.cnos = cnos;
        return this;
    }
    public String getCnos() {
        return this.cnos;
    }

    public CloudAgentMonitorStatisticsRequest setEndHour(Long endHour) {
        this.endHour = endHour;
        return this;
    }
    public Long getEndHour() {
        return this.endHour;
    }

    public CloudAgentMonitorStatisticsRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudAgentMonitorStatisticsRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public CloudAgentMonitorStatisticsRequest setGno(String gno) {
        this.gno = gno;
        return this;
    }
    public String getGno() {
        return this.gno;
    }

    public CloudAgentMonitorStatisticsRequest setIsNeedQueueName(String isNeedQueueName) {
        this.isNeedQueueName = isNeedQueueName;
        return this;
    }
    public String getIsNeedQueueName() {
        return this.isNeedQueueName;
    }

    public CloudAgentMonitorStatisticsRequest setIsUseGno(Long isUseGno) {
        this.isUseGno = isUseGno;
        return this;
    }
    public Long getIsUseGno() {
        return this.isUseGno;
    }

    public CloudAgentMonitorStatisticsRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public CloudAgentMonitorStatisticsRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public CloudAgentMonitorStatisticsRequest setStartHour(Long startHour) {
        this.startHour = startHour;
        return this;
    }
    public Long getStartHour() {
        return this.startHour;
    }

}
