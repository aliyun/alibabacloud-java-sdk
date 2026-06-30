// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateLogStoreConfigRequest extends TeaModel {
    /**
     * <p>The instance ID of Alibaba Cloud Global Accelerator (GA).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>A list of custom header field names to be included in access logs.</p>
     */
    @NameInMap("AccessLogRecordCustomizedHeaderList")
    public java.util.List<String> accessLogRecordCustomizedHeaderList;

    /**
     * <p>Specifies whether to include custom headers in access logs. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong> (default): No.</li>
     * </ul>
     * <blockquote>
     * <p>You can set this parameter to <strong>true</strong> only when the <strong>AccessLogEnabled</strong> toggle for the instance is turned on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AccessLogRecordCustomizedHeadersEnabled")
    public Boolean accessLogRecordCustomizedHeadersEnabled;

    /**
     * <p>An idempotent token.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the endpoint group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-bp1dmlohjjz4kqaun****</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The listener ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsr-xxxxxxxxxxxxxxx</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The region ID of the Alibaba Cloud Global Accelerator (GA) instance. The only valid value is cn-hangzhou.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the Logstore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-access-log-epg-01</p>
     */
    @NameInMap("SlsLogStoreName")
    public String slsLogStoreName;

    /**
     * <p>The name of the Data Service Project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-access-log</p>
     */
    @NameInMap("SlsProjectName")
    public String slsProjectName;

    public static UpdateLogStoreConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogStoreConfigRequest self = new UpdateLogStoreConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLogStoreConfigRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public UpdateLogStoreConfigRequest setAccessLogRecordCustomizedHeaderList(java.util.List<String> accessLogRecordCustomizedHeaderList) {
        this.accessLogRecordCustomizedHeaderList = accessLogRecordCustomizedHeaderList;
        return this;
    }
    public java.util.List<String> getAccessLogRecordCustomizedHeaderList() {
        return this.accessLogRecordCustomizedHeaderList;
    }

    public UpdateLogStoreConfigRequest setAccessLogRecordCustomizedHeadersEnabled(Boolean accessLogRecordCustomizedHeadersEnabled) {
        this.accessLogRecordCustomizedHeadersEnabled = accessLogRecordCustomizedHeadersEnabled;
        return this;
    }
    public Boolean getAccessLogRecordCustomizedHeadersEnabled() {
        return this.accessLogRecordCustomizedHeadersEnabled;
    }

    public UpdateLogStoreConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateLogStoreConfigRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public UpdateLogStoreConfigRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public UpdateLogStoreConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateLogStoreConfigRequest setSlsLogStoreName(String slsLogStoreName) {
        this.slsLogStoreName = slsLogStoreName;
        return this;
    }
    public String getSlsLogStoreName() {
        return this.slsLogStoreName;
    }

    public UpdateLogStoreConfigRequest setSlsProjectName(String slsProjectName) {
        this.slsProjectName = slsProjectName;
        return this;
    }
    public String getSlsProjectName() {
        return this.slsProjectName;
    }

}
