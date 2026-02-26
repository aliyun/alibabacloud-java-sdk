// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Car extends TeaModel {
    /**
     * <p>The boundary information.</p>
     */
    @NameInMap("Boundary")
    public Boundary boundary;

    /**
     * <p>The vehicle color. Valid values</p>
     * <ul>
     * <li>white</li>
     * <li>grey</li>
     * <li>yellow</li>
     * <li>red</li>
     * <li>green</li>
     * <li>blue</li>
     * <li>black</li>
     * <li>purple</li>
     * <li>brown</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>white</p>
     */
    @NameInMap("CarColor")
    public String carColor;

    /**
     * <p>The confidence level of the vehicle color. Valid values: 0 to 1. The value 0 indicates the lowest confidence level. The value 1 indicates the highest confidence level.</p>
     * 
     * <strong>example:</strong>
     * <p>0.604</p>
     */
    @NameInMap("CarColorConfidence")
    public Double carColorConfidence;

    /**
     * <p>The vehicle type. Valid values:</p>
     * <ul>
     * <li>car</li>
     * <li>bus</li>
     * <li>truck</li>
     * <li>van</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>van</p>
     */
    @NameInMap("CarType")
    public String carType;

    /**
     * <p>The confidence level of the vehicle type. Valid values: 0 to 1. The value 0 indicates the lowest confidence level. The value 1 indicates the highest confidence level.</p>
     * 
     * <strong>example:</strong>
     * <p>0.516</p>
     */
    @NameInMap("CarTypeConfidence")
    public Double carTypeConfidence;

    /**
     * <p>The confidence level of the vehicle detection result. Valid values: 0 to 1. The value 0 indicates the lowest confidence level. The value 1 indicates the highest confidence level.</p>
     * 
     * <strong>example:</strong>
     * <p>0.999</p>
     */
    @NameInMap("Confidence")
    public Double confidence;

    /**
     * <p>The license plates.</p>
     */
    @NameInMap("LicensePlates")
    public java.util.List<LicensePlate> licensePlates;

    public static Car build(java.util.Map<String, ?> map) throws Exception {
        Car self = new Car();
        return TeaModel.build(map, self);
    }

    public Car setBoundary(Boundary boundary) {
        this.boundary = boundary;
        return this;
    }
    public Boundary getBoundary() {
        return this.boundary;
    }

    public Car setCarColor(String carColor) {
        this.carColor = carColor;
        return this;
    }
    public String getCarColor() {
        return this.carColor;
    }

    public Car setCarColorConfidence(Double carColorConfidence) {
        this.carColorConfidence = carColorConfidence;
        return this;
    }
    public Double getCarColorConfidence() {
        return this.carColorConfidence;
    }

    public Car setCarType(String carType) {
        this.carType = carType;
        return this;
    }
    public String getCarType() {
        return this.carType;
    }

    public Car setCarTypeConfidence(Double carTypeConfidence) {
        this.carTypeConfidence = carTypeConfidence;
        return this;
    }
    public Double getCarTypeConfidence() {
        return this.carTypeConfidence;
    }

    public Car setConfidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }
    public Double getConfidence() {
        return this.confidence;
    }

    public Car setLicensePlates(java.util.List<LicensePlate> licensePlates) {
        this.licensePlates = licensePlates;
        return this;
    }
    public java.util.List<LicensePlate> getLicensePlates() {
        return this.licensePlates;
    }

}
