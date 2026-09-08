// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSmsMetadataRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. The value ranges from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. The value ranges from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the scenario. Valid values:</p>
     * <ul>
     * <li><p>SATISFACTION_SURVEY: satisfaction survey</p>
     * </li>
     * <li><p>CONTACT_FLOW_NODE: Interactive Voice Response (IVR) flow node</p>
     * </li>
     * <li><p>MISSED_CALL_NOTIFICATION: missed call notification</p>
     * </li>
     * <li><p>FLASH_SMS: Alibaba Cloud flash SMS notification</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;SATISFACTION_SURVEY&quot;,&quot;CONTACT_FLOW_NODE&quot;]</p>
     */
    @NameInMap("ScenarioListJson")
    public String scenarioListJson;

    public static ListSmsMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSmsMetadataRequest self = new ListSmsMetadataRequest();
        return TeaModel.build(map, self);
    }

    public ListSmsMetadataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSmsMetadataRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSmsMetadataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSmsMetadataRequest setScenarioListJson(String scenarioListJson) {
        this.scenarioListJson = scenarioListJson;
        return this;
    }
    public String getScenarioListJson() {
        return this.scenarioListJson;
    }

}
