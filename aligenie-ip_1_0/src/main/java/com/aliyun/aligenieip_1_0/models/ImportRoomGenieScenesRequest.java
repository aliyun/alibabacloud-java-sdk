// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ImportRoomGenieScenesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a7a3***013</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1211</p>
     */
    @NameInMap("RoomNo")
    public String roomNo;

    @NameInMap("SceneList")
    public java.util.List<ImportRoomGenieScenesRequestSceneList> sceneList;

    public static ImportRoomGenieScenesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportRoomGenieScenesRequest self = new ImportRoomGenieScenesRequest();
        return TeaModel.build(map, self);
    }

    public ImportRoomGenieScenesRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ImportRoomGenieScenesRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

    public ImportRoomGenieScenesRequest setSceneList(java.util.List<ImportRoomGenieScenesRequestSceneList> sceneList) {
        this.sceneList = sceneList;
        return this;
    }
    public java.util.List<ImportRoomGenieScenesRequestSceneList> getSceneList() {
        return this.sceneList;
    }

    public static class ImportRoomGenieScenesRequestSceneListActionsAttributeValues extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>powerstate</p>
         */
        @NameInMap("AttributeName")
        public String attributeName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AttributeValue")
        public String attributeValue;

        public static ImportRoomGenieScenesRequestSceneListActionsAttributeValues build(java.util.Map<String, ?> map) throws Exception {
            ImportRoomGenieScenesRequestSceneListActionsAttributeValues self = new ImportRoomGenieScenesRequestSceneListActionsAttributeValues();
            return TeaModel.build(map, self);
        }

        public ImportRoomGenieScenesRequestSceneListActionsAttributeValues setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public ImportRoomGenieScenesRequestSceneListActionsAttributeValues setAttributeValue(String attributeValue) {
            this.attributeValue = attributeValue;
            return this;
        }
        public String getAttributeValue() {
            return this.attributeValue;
        }

    }

    public static class ImportRoomGenieScenesRequestSceneListActionsDevice extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>light</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeviceIndex")
        public Integer deviceIndex;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3c5d2ab8f9ec</p>
         */
        @NameInMap("DeviceNumber")
        public String deviceNumber;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static ImportRoomGenieScenesRequestSceneListActionsDevice build(java.util.Map<String, ?> map) throws Exception {
            ImportRoomGenieScenesRequestSceneListActionsDevice self = new ImportRoomGenieScenesRequestSceneListActionsDevice();
            return TeaModel.build(map, self);
        }

        public ImportRoomGenieScenesRequestSceneListActionsDevice setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ImportRoomGenieScenesRequestSceneListActionsDevice setDeviceIndex(Integer deviceIndex) {
            this.deviceIndex = deviceIndex;
            return this;
        }
        public Integer getDeviceIndex() {
            return this.deviceIndex;
        }

        public ImportRoomGenieScenesRequestSceneListActionsDevice setDeviceNumber(String deviceNumber) {
            this.deviceNumber = deviceNumber;
            return this;
        }
        public String getDeviceNumber() {
            return this.deviceNumber;
        }

        public ImportRoomGenieScenesRequestSceneListActionsDevice setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class ImportRoomGenieScenesRequestSceneListActions extends TeaModel {
        @NameInMap("AttributeValues")
        public java.util.List<ImportRoomGenieScenesRequestSceneListActionsAttributeValues> attributeValues;

        @NameInMap("Device")
        public ImportRoomGenieScenesRequestSceneListActionsDevice device;

        @NameInMap("Reply")
        public String reply;

        @NameInMap("Type")
        public Integer type;

        public static ImportRoomGenieScenesRequestSceneListActions build(java.util.Map<String, ?> map) throws Exception {
            ImportRoomGenieScenesRequestSceneListActions self = new ImportRoomGenieScenesRequestSceneListActions();
            return TeaModel.build(map, self);
        }

        public ImportRoomGenieScenesRequestSceneListActions setAttributeValues(java.util.List<ImportRoomGenieScenesRequestSceneListActionsAttributeValues> attributeValues) {
            this.attributeValues = attributeValues;
            return this;
        }
        public java.util.List<ImportRoomGenieScenesRequestSceneListActionsAttributeValues> getAttributeValues() {
            return this.attributeValues;
        }

        public ImportRoomGenieScenesRequestSceneListActions setDevice(ImportRoomGenieScenesRequestSceneListActionsDevice device) {
            this.device = device;
            return this;
        }
        public ImportRoomGenieScenesRequestSceneListActionsDevice getDevice() {
            return this.device;
        }

        public ImportRoomGenieScenesRequestSceneListActions setReply(String reply) {
            this.reply = reply;
            return this;
        }
        public String getReply() {
            return this.reply;
        }

        public ImportRoomGenieScenesRequestSceneListActions setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class ImportRoomGenieScenesRequestSceneListTriggersAttributeValues extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("AttributeName")
        public String attributeName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("AttributeValue")
        public String attributeValue;

        public static ImportRoomGenieScenesRequestSceneListTriggersAttributeValues build(java.util.Map<String, ?> map) throws Exception {
            ImportRoomGenieScenesRequestSceneListTriggersAttributeValues self = new ImportRoomGenieScenesRequestSceneListTriggersAttributeValues();
            return TeaModel.build(map, self);
        }

        public ImportRoomGenieScenesRequestSceneListTriggersAttributeValues setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public ImportRoomGenieScenesRequestSceneListTriggersAttributeValues setAttributeValue(String attributeValue) {
            this.attributeValue = attributeValue;
            return this;
        }
        public String getAttributeValue() {
            return this.attributeValue;
        }

    }

    public static class ImportRoomGenieScenesRequestSceneListTriggersDevice extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Category")
        public String category;

        @NameInMap("DeviceIndex")
        public String deviceIndex;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("DeviceNumber")
        public String deviceNumber;

        public static ImportRoomGenieScenesRequestSceneListTriggersDevice build(java.util.Map<String, ?> map) throws Exception {
            ImportRoomGenieScenesRequestSceneListTriggersDevice self = new ImportRoomGenieScenesRequestSceneListTriggersDevice();
            return TeaModel.build(map, self);
        }

        public ImportRoomGenieScenesRequestSceneListTriggersDevice setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ImportRoomGenieScenesRequestSceneListTriggersDevice setDeviceIndex(String deviceIndex) {
            this.deviceIndex = deviceIndex;
            return this;
        }
        public String getDeviceIndex() {
            return this.deviceIndex;
        }

        public ImportRoomGenieScenesRequestSceneListTriggersDevice setDeviceNumber(String deviceNumber) {
            this.deviceNumber = deviceNumber;
            return this;
        }
        public String getDeviceNumber() {
            return this.deviceNumber;
        }

    }

    public static class ImportRoomGenieScenesRequestSceneListTriggers extends TeaModel {
        @NameInMap("AttributeValues")
        public java.util.List<ImportRoomGenieScenesRequestSceneListTriggersAttributeValues> attributeValues;

        @NameInMap("CorpusList")
        public java.util.List<String> corpusList;

        @NameInMap("Device")
        public ImportRoomGenieScenesRequestSceneListTriggersDevice device;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static ImportRoomGenieScenesRequestSceneListTriggers build(java.util.Map<String, ?> map) throws Exception {
            ImportRoomGenieScenesRequestSceneListTriggers self = new ImportRoomGenieScenesRequestSceneListTriggers();
            return TeaModel.build(map, self);
        }

        public ImportRoomGenieScenesRequestSceneListTriggers setAttributeValues(java.util.List<ImportRoomGenieScenesRequestSceneListTriggersAttributeValues> attributeValues) {
            this.attributeValues = attributeValues;
            return this;
        }
        public java.util.List<ImportRoomGenieScenesRequestSceneListTriggersAttributeValues> getAttributeValues() {
            return this.attributeValues;
        }

        public ImportRoomGenieScenesRequestSceneListTriggers setCorpusList(java.util.List<String> corpusList) {
            this.corpusList = corpusList;
            return this;
        }
        public java.util.List<String> getCorpusList() {
            return this.corpusList;
        }

        public ImportRoomGenieScenesRequestSceneListTriggers setDevice(ImportRoomGenieScenesRequestSceneListTriggersDevice device) {
            this.device = device;
            return this;
        }
        public ImportRoomGenieScenesRequestSceneListTriggersDevice getDevice() {
            return this.device;
        }

        public ImportRoomGenieScenesRequestSceneListTriggers setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class ImportRoomGenieScenesRequestSceneList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Actions")
        public java.util.List<ImportRoomGenieScenesRequestSceneListActions> actions;

        @NameInMap("Description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Display")
        public Boolean display;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx.com/yyy.png">http://xxx.com/yyy.png</a></p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TriggerLogical")
        public Integer triggerLogical;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Triggers")
        public java.util.List<ImportRoomGenieScenesRequestSceneListTriggers> triggers;

        public static ImportRoomGenieScenesRequestSceneList build(java.util.Map<String, ?> map) throws Exception {
            ImportRoomGenieScenesRequestSceneList self = new ImportRoomGenieScenesRequestSceneList();
            return TeaModel.build(map, self);
        }

        public ImportRoomGenieScenesRequestSceneList setActions(java.util.List<ImportRoomGenieScenesRequestSceneListActions> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<ImportRoomGenieScenesRequestSceneListActions> getActions() {
            return this.actions;
        }

        public ImportRoomGenieScenesRequestSceneList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ImportRoomGenieScenesRequestSceneList setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public ImportRoomGenieScenesRequestSceneList setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ImportRoomGenieScenesRequestSceneList setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ImportRoomGenieScenesRequestSceneList setTriggerLogical(Integer triggerLogical) {
            this.triggerLogical = triggerLogical;
            return this;
        }
        public Integer getTriggerLogical() {
            return this.triggerLogical;
        }

        public ImportRoomGenieScenesRequestSceneList setTriggers(java.util.List<ImportRoomGenieScenesRequestSceneListTriggers> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<ImportRoomGenieScenesRequestSceneListTriggers> getTriggers() {
            return this.triggers;
        }

    }

}
