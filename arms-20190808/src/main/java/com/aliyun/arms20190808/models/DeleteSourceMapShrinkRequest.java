// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteSourceMapShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the SourceMap file.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FidList")
    public String fidListShrink;

    /**
     * <p>The process ID (PID) of the application.</p>
     * <p>Log on to the ARMS console. In the left-side navigation pane, choose <strong>Browser Monitoring</strong> &gt; <strong>Browser Monitoring</strong>. On the <strong>Browser Monitoring</strong> page, click the name of an application. The URL in the browser address bar contains the PID of this application in the format of <code>pid=xxx</code>. As the browser is encoded, the PID needs to be modified. Assume that the PID contained is <code>xxx%4074xxx</code>. You need to <strong>replace</strong> \<em>\</em>%40 with @\<em>\</em> and change the PID to <code>xxx@74xxx</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>atc889zkcf@d8deedfa9bf****</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteSourceMapShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSourceMapShrinkRequest self = new DeleteSourceMapShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSourceMapShrinkRequest setFidListShrink(String fidListShrink) {
        this.fidListShrink = fidListShrink;
        return this;
    }
    public String getFidListShrink() {
        return this.fidListShrink;
    }

    public DeleteSourceMapShrinkRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public DeleteSourceMapShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
