// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gwlb20240415.models;

import com.aliyun.tea.*;

public class GetListenerAttributeResponseBody extends TeaModel {
    /**
     * <p>The listener description.</p>
     * <p>The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>listener_description</p>
     */
    @NameInMap("ListenerDescription")
    public String listenerDescription;

    /**
     * <p>The listener ID.</p>
     * 
     * <strong>example:</strong>
     * <p>lsn-3kbj3587mqhm3p****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The listener status. Valid values:</p>
     * <ul>
     * <li><strong>Provisioning</strong>: The listener is being created.</li>
     * <li><strong>Running</strong>: The listener is running.</li>
     * <li><strong>Configuring</strong>: The listener is being configured.</li>
     * <li><strong>Deleting</strong>: The listener is being deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Provisioning</p>
     */
    @NameInMap("ListenerStatus")
    public String listenerStatus;

    /**
     * <p>The GWLB instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gwlb-te609d6696632f76****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The region ID of the GWLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75CC3312-7757-5EE1-90D8-49CEA66608AE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The server group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sgp-sp8d2r6y7t0xtl****</p>
     */
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetListenerAttributeResponseBodyTags> tags;

    public static GetListenerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetListenerAttributeResponseBody self = new GetListenerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetListenerAttributeResponseBody setListenerDescription(String listenerDescription) {
        this.listenerDescription = listenerDescription;
        return this;
    }
    public String getListenerDescription() {
        return this.listenerDescription;
    }

    public GetListenerAttributeResponseBody setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public GetListenerAttributeResponseBody setListenerStatus(String listenerStatus) {
        this.listenerStatus = listenerStatus;
        return this;
    }
    public String getListenerStatus() {
        return this.listenerStatus;
    }

    public GetListenerAttributeResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public GetListenerAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetListenerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetListenerAttributeResponseBody setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    public GetListenerAttributeResponseBody setTags(java.util.List<GetListenerAttributeResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetListenerAttributeResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class GetListenerAttributeResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key. The tag key cannot be an empty string. The tag key can be up to 128 characters in length, and cannot start with <code>acs: </code>or <code>aliyun</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 256 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetListenerAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetListenerAttributeResponseBodyTags self = new GetListenerAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetListenerAttributeResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetListenerAttributeResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
