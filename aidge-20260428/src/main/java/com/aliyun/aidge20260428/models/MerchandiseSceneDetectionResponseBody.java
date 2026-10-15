// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MerchandiseSceneDetectionResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The display scene detection result.</p>
     */
    @NameInMap("Data")
    public MerchandiseSceneDetectionResponseBodyData data;

    /**
     * <p>The response message or failure description.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>70CBEFDF-BB17-1EB3-8A21-569F3124738F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static MerchandiseSceneDetectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MerchandiseSceneDetectionResponseBody self = new MerchandiseSceneDetectionResponseBody();
        return TeaModel.build(map, self);
    }

    public MerchandiseSceneDetectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MerchandiseSceneDetectionResponseBody setData(MerchandiseSceneDetectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MerchandiseSceneDetectionResponseBodyData getData() {
        return this.data;
    }

    public MerchandiseSceneDetectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MerchandiseSceneDetectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MerchandiseSceneDetectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MerchandiseSceneDetectionResponseBodyDataResultGroundingRegions extends TeaModel {
        /**
         * <p>The 2D bounding box in the format of [top-left x, top-left y, bottom-right x, bottom-right y]. Valid values: 0 to 1000. The left coordinate must be less than the right coordinate, and the top coordinate must be less than the bottom coordinate.</p>
         */
        @NameInMap("Bbox_2d")
        public java.util.List<Double> bbox2d;

        /**
         * <p>The label.</p>
         * 
         * <strong>example:</strong>
         * <p>shelf</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The recognized text.</p>
         * 
         * <strong>example:</strong>
         * <p>Multi-tier product display shelf</p>
         */
        @NameInMap("Text")
        public String text;

        public static MerchandiseSceneDetectionResponseBodyDataResultGroundingRegions build(java.util.Map<String, ?> map) throws Exception {
            MerchandiseSceneDetectionResponseBodyDataResultGroundingRegions self = new MerchandiseSceneDetectionResponseBodyDataResultGroundingRegions();
            return TeaModel.build(map, self);
        }

        public MerchandiseSceneDetectionResponseBodyDataResultGroundingRegions setBbox2d(java.util.List<Double> bbox2d) {
            this.bbox2d = bbox2d;
            return this;
        }
        public java.util.List<Double> getBbox2d() {
            return this.bbox2d;
        }

        public MerchandiseSceneDetectionResponseBodyDataResultGroundingRegions setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public MerchandiseSceneDetectionResponseBodyDataResultGroundingRegions setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class MerchandiseSceneDetectionResponseBodyDataResultGrounding extends TeaModel {
        /**
         * <p>The coverage.</p>
         * 
         * <strong>example:</strong>
         * <p>complete</p>
         */
        @NameInMap("Coverage")
        public String coverage;

        /**
         * <p>The list of regions.</p>
         */
        @NameInMap("Regions")
        public java.util.List<MerchandiseSceneDetectionResponseBodyDataResultGroundingRegions> regions;

        public static MerchandiseSceneDetectionResponseBodyDataResultGrounding build(java.util.Map<String, ?> map) throws Exception {
            MerchandiseSceneDetectionResponseBodyDataResultGrounding self = new MerchandiseSceneDetectionResponseBodyDataResultGrounding();
            return TeaModel.build(map, self);
        }

        public MerchandiseSceneDetectionResponseBodyDataResultGrounding setCoverage(String coverage) {
            this.coverage = coverage;
            return this;
        }
        public String getCoverage() {
            return this.coverage;
        }

        public MerchandiseSceneDetectionResponseBodyDataResultGrounding setRegions(java.util.List<MerchandiseSceneDetectionResponseBodyDataResultGroundingRegions> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<MerchandiseSceneDetectionResponseBodyDataResultGroundingRegions> getRegions() {
            return this.regions;
        }

    }

    public static class MerchandiseSceneDetectionResponseBodyDataResultScenesSceneLocation extends TeaModel {
        /**
         * <p>The x-coordinate of the region point.</p>
         * 
         * <strong>example:</strong>
         * <p>0.431</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The y-coordinate of the region point.</p>
         * 
         * <strong>example:</strong>
         * <p>0.973</p>
         */
        @NameInMap("Y")
        public Double y;

        public static MerchandiseSceneDetectionResponseBodyDataResultScenesSceneLocation build(java.util.Map<String, ?> map) throws Exception {
            MerchandiseSceneDetectionResponseBodyDataResultScenesSceneLocation self = new MerchandiseSceneDetectionResponseBodyDataResultScenesSceneLocation();
            return TeaModel.build(map, self);
        }

        public MerchandiseSceneDetectionResponseBodyDataResultScenesSceneLocation setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public MerchandiseSceneDetectionResponseBodyDataResultScenesSceneLocation setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class MerchandiseSceneDetectionResponseBodyDataResultScenes extends TeaModel {
        /**
         * <p>Optional. The area proportion.</p>
         * 
         * <strong>example:</strong>
         * <p>0.985</p>
         */
        @NameInMap("AreaRate")
        public Double areaRate;

        /**
         * <p>Optional. The purity metric for proprietary products. The specific business criteria are subject to the recognition service.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OwnPurity")
        public Double ownPurity;

        /**
         * <p>Optional. The display plumpness metric.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Plumpness")
        public Double plumpness;

        /**
         * <p>The display name of the scene. If omitted, the value is an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>Air-cooled display cabinet</p>
         */
        @NameInMap("SceneActualName")
        public String sceneActualName;

        /**
         * <p>The center point of the scene, which retains the original normalized coordinates. If omitted, the value is an empty array.</p>
         */
        @NameInMap("SceneCenter")
        public java.util.List<Double> sceneCenter;

        /**
         * <p>The list of region points. Each item is in the {x,y} format and retains the original normalized coordinates. If omitted, the value is an empty array.</p>
         */
        @NameInMap("SceneLocation")
        public java.util.List<MerchandiseSceneDetectionResponseBodyDataResultScenesSceneLocation> sceneLocation;

        /**
         * <p>The scene identifier. This parameter is required and cannot be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>yl_cj_lfg</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>Optional. The shelf distribution proportion metric. The specific business criteria are subject to the recognition service.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ShelfDistributionRate")
        public Double shelfDistributionRate;

        public static MerchandiseSceneDetectionResponseBodyDataResultScenes build(java.util.Map<String, ?> map) throws Exception {
            MerchandiseSceneDetectionResponseBodyDataResultScenes self = new MerchandiseSceneDetectionResponseBodyDataResultScenes();
            return TeaModel.build(map, self);
        }

        public MerchandiseSceneDetectionResponseBodyDataResultScenes setAreaRate(Double areaRate) {
            this.areaRate = areaRate;
            return this;
        }
        public Double getAreaRate() {
            return this.areaRate;
        }

        public MerchandiseSceneDetectionResponseBodyDataResultScenes setOwnPurity(Double ownPurity) {
            this.ownPurity = ownPurity;
            return this;
        }
        public Double getOwnPurity() {
            return this.ownPurity;
        }

        public MerchandiseSceneDetectionResponseBodyDataResultScenes setPlumpness(Double plumpness) {
            this.plumpness = plumpness;
            return this;
        }
        public Double getPlumpness() {
            return this.plumpness;
        }

        public MerchandiseSceneDetectionResponseBodyDataResultScenes setSceneActualName(String sceneActualName) {
            this.sceneActualName = sceneActualName;
            return this;
        }
        public String getSceneActualName() {
            return this.sceneActualName;
        }

        public MerchandiseSceneDetectionResponseBodyDataResultScenes setSceneCenter(java.util.List<Double> sceneCenter) {
            this.sceneCenter = sceneCenter;
            return this;
        }
        public java.util.List<Double> getSceneCenter() {
            return this.sceneCenter;
        }

        public MerchandiseSceneDetectionResponseBodyDataResultScenes setSceneLocation(java.util.List<MerchandiseSceneDetectionResponseBodyDataResultScenesSceneLocation> sceneLocation) {
            this.sceneLocation = sceneLocation;
            return this;
        }
        public java.util.List<MerchandiseSceneDetectionResponseBodyDataResultScenesSceneLocation> getSceneLocation() {
            return this.sceneLocation;
        }

        public MerchandiseSceneDetectionResponseBodyDataResultScenes setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public MerchandiseSceneDetectionResponseBodyDataResultScenes setShelfDistributionRate(Double shelfDistributionRate) {
            this.shelfDistributionRate = shelfDistributionRate;
            return this;
        }
        public Double getShelfDistributionRate() {
            return this.shelfDistributionRate;
        }

    }

    public static class MerchandiseSceneDetectionResponseBodyDataResult extends TeaModel {
        /**
         * <p>The positioning information.</p>
         */
        @NameInMap("Grounding")
        public MerchandiseSceneDetectionResponseBodyDataResultGrounding grounding;

        /**
         * <p>The list of recognized scenes.</p>
         */
        @NameInMap("Scenes")
        public java.util.List<MerchandiseSceneDetectionResponseBodyDataResultScenes> scenes;

        /**
         * <p>Fixed value: scene.</p>
         * 
         * <strong>example:</strong>
         * <p>scene</p>
         */
        @NameInMap("Type")
        public String type;

        public static MerchandiseSceneDetectionResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            MerchandiseSceneDetectionResponseBodyDataResult self = new MerchandiseSceneDetectionResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public MerchandiseSceneDetectionResponseBodyDataResult setGrounding(MerchandiseSceneDetectionResponseBodyDataResultGrounding grounding) {
            this.grounding = grounding;
            return this;
        }
        public MerchandiseSceneDetectionResponseBodyDataResultGrounding getGrounding() {
            return this.grounding;
        }

        public MerchandiseSceneDetectionResponseBodyDataResult setScenes(java.util.List<MerchandiseSceneDetectionResponseBodyDataResultScenes> scenes) {
            this.scenes = scenes;
            return this;
        }
        public java.util.List<MerchandiseSceneDetectionResponseBodyDataResultScenes> getScenes() {
            return this.scenes;
        }

        public MerchandiseSceneDetectionResponseBodyDataResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MerchandiseSceneDetectionResponseBodyData extends TeaModel {
        /**
         * <p>The details of the display scene detection result.</p>
         */
        @NameInMap("Result")
        public MerchandiseSceneDetectionResponseBodyDataResult result;

        /**
         * <p>The usage information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProcessingCount&quot;:1}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static MerchandiseSceneDetectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MerchandiseSceneDetectionResponseBodyData self = new MerchandiseSceneDetectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MerchandiseSceneDetectionResponseBodyData setResult(MerchandiseSceneDetectionResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public MerchandiseSceneDetectionResponseBodyDataResult getResult() {
            return this.result;
        }

        public MerchandiseSceneDetectionResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
