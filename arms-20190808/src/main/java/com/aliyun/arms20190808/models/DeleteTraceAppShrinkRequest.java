// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteTraceAppShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the application that you want to delete. You can call the SearchTraceAppByName operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/130676.html">SearchTraceAppByName</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5406**</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The reason(s) to delete application.</p>
     */
    @NameInMap("DeleteReason")
    public String deleteReasonShrink;

    /**
     * <p>The PID of the application. For more information about how to query the PID, see <a href="https://www.alibabacloud.com/help/zh/doc-detail/186100.htm?spm=a2cdw.13409063.0.0.7a72281f0bkTfx#title-imy-7gj-qhr">QueryMetricByPage</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9w0sc5gxxz@edcsd447c2f****</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The ID of the region in which the application is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the application that you want to delete. You can call the SearchTraceAppByName operation to query the application type. For more information, see <a href="https://help.aliyun.com/document_detail/130676.html">SearchTraceAppByName</a>. Valid values:</p>
     * <ul>
     * <li><code>TRACE</code>: Application Monitoring</li>
     * <li><code>RETCODE</code>: frontend monitoring</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TRACE</p>
     */
    @NameInMap("Type")
    public String type;

    public static DeleteTraceAppShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTraceAppShrinkRequest self = new DeleteTraceAppShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTraceAppShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteTraceAppShrinkRequest setDeleteReasonShrink(String deleteReasonShrink) {
        this.deleteReasonShrink = deleteReasonShrink;
        return this;
    }
    public String getDeleteReasonShrink() {
        return this.deleteReasonShrink;
    }

    public DeleteTraceAppShrinkRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public DeleteTraceAppShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteTraceAppShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
