// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class SendCustomEventRequest extends TeaModel {
    /**
     * <p>User ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1214484929940219</p>
     */
    @NameInMap("CustomerId")
    public String customerId;

    /**
     * <p>Data source.</p>
     * 
     * <strong>example:</strong>
     * <p>aegis_suspicious_event</p>
     */
    @NameInMap("DataSource")
    public String dataSource;

    /**
     * <p>Event details.</p>
     * 
     * <strong>example:</strong>
     * <p>疑似病毒木马启动运行。</p>
     */
    @NameInMap("EventDescription")
    public String eventDescription;

    /**
     * <p>Alert event details.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;提示&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;在您的系统上发现可疑进程启动行为，通常与病毒木马或入侵事件相关&quot;},{&quot;name&quot;:&quot;ATT&amp;CK攻击阶段&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;代码执行&quot;},{&quot;name&quot;:&quot;恶意行为&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;可疑的漏洞利用代码执行&quot;},{&quot;name&quot;:&quot;规则类型&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;进程启动&quot;},{&quot;name&quot;:&quot;规则引擎&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;精准攻击识别引擎&quot;},{&quot;name&quot;:&quot;处置动作&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;阻断行为&quot;},{&quot;name&quot;:&quot;进程路径&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;/usr/bin/python3.9&quot;},{&quot;name&quot;:&quot;命令行&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;python3 /root/poc/python/cve-2018-15473.py --username root --port 22&quot;},{&quot;name&quot;:&quot;父进程路径&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;/bin/gunkit&quot;},{&quot;name&quot;:&quot;父进程命令行&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;gunkit serve-grpc --addr unix:///data/gunkit-grpc.sock&quot;},{&quot;name&quot;:&quot;进程ID&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;22714&quot;},{&quot;name&quot;:&quot;父进程ID&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;2986&quot;},{&quot;name&quot;:&quot;描述&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;主动防御检测到可疑进程启动行为，这类可疑进程通常存在于特殊的系统目录，或通过后缀伪装成文档/音频/图片等文件诱导用户运行，该异常行为已被成功拦截&quot;},{&quot;name&quot;:&quot;处置建议&quot;,&quot;type&quot;:&quot;text&quot;,&quot;value&quot;:&quot;请您及时排查是否是正常的业务操作，如果您觉得此次拦截是非预期的，那您可以在主动防御 - 恶意行为防御页面中，关闭“可疑进程启动“规则集或者将受影响机器从管理主机中移除&quot;},{&quot;name&quot;:&quot;父进程关系&quot;,&quot;type&quot;:&quot;processChain&quot;,&quot;value&quot;:&quot;1:::/usr/lib/systemd/systemd --switched-root --system --deserialize 22 &amp;&amp;&amp; 2939:::/usr/local/bin/containerd-shim-runc-v2 -namespace moby -id 270f164903b47d4e219b410b8d11d9079a7ad1bac8133aea604598300d3b03d5 -address /run/containerd/containerd.sock &amp;&amp;&amp; 2962:::/usr/bin/python3 /usr/bin/supervisord -n &amp;&amp;&amp; 2986:::gunkit serve-grpc --addr unix:///data/gunkit-grpc.sock&quot;}]</p>
     */
    @NameInMap("EventDetails")
    public String eventDetails;

    /**
     * <p>Event name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>客户端离线</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>Event type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SUSP_CUSTOM_CFW</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>Alert discovery time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-23 14:47:34</p>
     */
    @NameInMap("FindTime")
    public Long findTime;

    /**
     * <p>Instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-uf60h3ns25bzq9eyf8ps</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>猫吉-售卖-MDR扫描器集群1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>Whether to send.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsSend")
    public String isSend;

    /**
     * <p>Event level.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>serious</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The first occurrence time of the alert event.</p>
     * 
     * <strong>example:</strong>
     * <p>1724956996000</p>
     */
    @NameInMap("OccurrenceTime")
    public Long occurrenceTime;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>Product name.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudSecCenter</p>
     */
    @NameInMap("Product")
    public String product;

    /**
     * <p>Unique ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>68888f02-98f2-492b-a2b2-5b13295755b7</p>
     */
    @NameInMap("UniqueId")
    public String uniqueId;

    /**
     * <p>UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>93B6CDAB-7D2E-33D2-9EBA-25D561A2E95F</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static SendCustomEventRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCustomEventRequest self = new SendCustomEventRequest();
        return TeaModel.build(map, self);
    }

    public SendCustomEventRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public SendCustomEventRequest setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public SendCustomEventRequest setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
        return this;
    }
    public String getEventDescription() {
        return this.eventDescription;
    }

    public SendCustomEventRequest setEventDetails(String eventDetails) {
        this.eventDetails = eventDetails;
        return this;
    }
    public String getEventDetails() {
        return this.eventDetails;
    }

    public SendCustomEventRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public SendCustomEventRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public SendCustomEventRequest setFindTime(Long findTime) {
        this.findTime = findTime;
        return this;
    }
    public Long getFindTime() {
        return this.findTime;
    }

    public SendCustomEventRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SendCustomEventRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public SendCustomEventRequest setIsSend(String isSend) {
        this.isSend = isSend;
        return this;
    }
    public String getIsSend() {
        return this.isSend;
    }

    public SendCustomEventRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public SendCustomEventRequest setOccurrenceTime(Long occurrenceTime) {
        this.occurrenceTime = occurrenceTime;
        return this;
    }
    public Long getOccurrenceTime() {
        return this.occurrenceTime;
    }

    public SendCustomEventRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SendCustomEventRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public SendCustomEventRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public SendCustomEventRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
