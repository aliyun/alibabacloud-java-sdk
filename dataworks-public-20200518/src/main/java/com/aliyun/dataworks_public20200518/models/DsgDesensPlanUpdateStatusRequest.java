// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgDesensPlanUpdateStatusRequest extends TeaModel {
    /**
     * <p>A collection of IDs of the data masking rules of which the status you want to modify.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ids")
    public java.util.List<Integer> ids;

    /**
     * <p>The code of the level-1 data masking scenario to which the rule belongs. Valid values:</p>
     * <ul>
     * <li>dataworks_display_desense_code: masking of displayed data in DataStudio and Data Map</li>
     * <li>maxcompute_desense_code: data masking at the MaxCompute compute engine layer</li>
     * <li>maxcompute_new_desense_code: data masking at the MaxCompute compute engine layer (new)</li>
     * <li>hologres_display_desense_code: data masking at the Hologres compute engine layer</li>
     * <li>dataworks_data_integration_desense_code: static data masking in Data Integration</li>
     * <li>dataworks_analysis_desense_code: masking of displayed data in DataAnalysis</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dataworks_display_desense_code</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>The status of the data masking rule. Valid values:</p>
     * <ul>
     * <li>0: expired</li>
     * <li>1: effective</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DsgDesensPlanUpdateStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgDesensPlanUpdateStatusRequest self = new DsgDesensPlanUpdateStatusRequest();
        return TeaModel.build(map, self);
    }

    public DsgDesensPlanUpdateStatusRequest setIds(java.util.List<Integer> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Integer> getIds() {
        return this.ids;
    }

    public DsgDesensPlanUpdateStatusRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public DsgDesensPlanUpdateStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
