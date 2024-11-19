// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetDeviceGroupTagsRequest extends TeaModel {
    /**
     * <p>The ID of the group. The ID is the globally unique identifier (GUID) for the group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>W16X8Tvdosec****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The type of the group.</p>
     * <p>You do not need to configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>LINK_PLATFORM_DYNAMIC</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The ID of the instance. On the <strong>Overview</strong> page in the IoT Platform console, you can view the <strong>ID</strong> of the instance.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
     * <li>If the <strong>Overview</strong> page or instance ID is not displayed in the IoT Platform console, you do not need to configure this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information about the instance, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The tag data in the JSON format. The TagString parameter specifies multiple tags in the format of key-value pairs. You must specify <strong>tagKey</strong> and <strong>tagValue</strong> for each tag.</p>
     * <ul>
     * <li><strong>tagKey</strong>: the tag key. The key must be 2 to 30 characters in length, and can contain letters, digits, and periods (.).</li>
     * <li><strong>tagValue</strong>: the tag value. Each value can contain letters, digits, underscores (_), and hyphens (-). The value must be 1 to 128 characters in length.</li>
     * </ul>
     * <p>Separate multiple tags with commas (,). Example: <code>[{&quot;tagKey&quot;:&quot;h1&quot;,&quot;tagValue&quot;:&quot;rr&quot;},{&quot;tagKey&quot;:&quot;7h&quot;,&quot;tagValue&quot;:&quot;rr&quot;}]</code></p>
     * <p>If you specify a new value for an existing tag, the new tag value overwrites the original value.</p>
     * <p>If you want to delete a tag, you do not need to specify the key and value for the tag.</p>
     * <p>**</p>
     * <p><strong>Important</strong> <code>abc</code> is a key that is reserved by IoT Platform. You cannot set <strong>tagKey</strong> to abc. If you set <code>tagKey</code> to abc, the abc tag is automatically filtered when you query tags.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;tagKey&quot;:&quot;h1&quot;,&quot;tagValue&quot;:&quot;rr&quot;},{&quot;tagKey&quot;:&quot;7h&quot;,&quot;tagValue&quot;:&quot;rr&quot;}]</p>
     */
    @NameInMap("TagString")
    public String tagString;

    public static SetDeviceGroupTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDeviceGroupTagsRequest self = new SetDeviceGroupTagsRequest();
        return TeaModel.build(map, self);
    }

    public SetDeviceGroupTagsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SetDeviceGroupTagsRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public SetDeviceGroupTagsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public SetDeviceGroupTagsRequest setTagString(String tagString) {
        this.tagString = tagString;
        return this;
    }
    public String getTagString() {
        return this.tagString;
    }

}
